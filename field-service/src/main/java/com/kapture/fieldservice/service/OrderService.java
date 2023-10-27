package com.kapture.fieldservice.service;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;
import com.kapture.fieldservice.object.Config;
import com.kapture.fieldservice.object.Order;
import com.kapture.fieldservice.repository.ConfigRepository;
import com.kapture.fieldservice.repository.OrderRepository;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class OrderService {
    private static final String CONFIG_TYPE = "ORDER_CONFIG";
    private static final int    CMID        = 69;
    @Autowired
    ConfigRepository            configRepository;
    @Autowired
    OrderRepository             orderRepository;

    public ResponseEntity< ? > add(String requestPayload, HttpServletRequest request) {
        Config config = configRepository.findByCmIdAndConfigName(CMID, CONFIG_TYPE);
        System.out.println("config " + config);
        if (config != null) {

            try {
                String jConfig = config.getConfig();
                JSONObject pathObject = JSONObject.fromObject(jConfig).optJSONObject("path");
                Order order = new Order();
                order.setCmId(CMID);
                @SuppressWarnings("unchecked")
                Iterator<String> it = pathObject.keys();
                String orderItems = "{\"orderItems\":[{\"qty\":\"\",\"skuCode\":\"\"},{\"qty\":\"\",\"skuCode\":\"\"}]}";
                while (it.hasNext()) {
                    String key = it.next();
                    System.out.println(key + " " + pathObject.get(key));
                    String path = pathObject.optString(key);

                    String str[] = path.split("]");
                    Object value = "";
                    String arrayPathFinal = "";
                    if (str[0].indexOf('[') > -1) {
                        String arrayPath = str[0].substring(0, str[0].length() - 2);
                        if (isPathValid(arrayPath, requestPayload)) {
                            Object obj = JsonPath.read(requestPayload, "$." + arrayPath);
                            JSONArray jsonArray = JSONArray.fromObject(obj);
                            for (int i = 0; i < jsonArray.size(); i++) {
                                if (isPathValid(arrayPath + "[" + i + "]" + str[1], requestPayload)) {
                                    value += JsonPath.read(requestPayload, "$." + arrayPath + "[" + i + "]" + str[1]).toString() + ",";
                                    arrayPathFinal = arrayPath + "[" + i + "]" + str[1];
                                    if (key.contains("orderItems.")) {
                                        String key1 = key.replace("[i]", "[" + i + "]");
                                        DocumentContext documentContext = JsonPath.parse(orderItems);
                                        orderItems = documentContext
                                                .set(key1, JsonPath.read(requestPayload, "$." + arrayPath + "[" + i + "]" + str[1]).toString())
                                                .jsonString();

                                    }
                                }
                            }
                        }
                    }
                    boolean isValid = str[0].indexOf('[') == -1 && isPathValid(path, requestPayload);
                    if (isValid) {
                        value = JsonPath.read(requestPayload, "$." + path);
                    } else {
                        path = arrayPathFinal;
                    }
                    value = (value + "").replaceAll(",$", "");
                    System.out.println("key " + key + " value " + value);
                    PropertyUtils.setProperty(order, key, value);
                }
                order.setOrderDetails(requestPayload);
                order.setOrderItems(orderItems);
                System.out.println(orderRepository.save(order));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public boolean isPathValid(String path, String jsonString) {
        try {
            JsonPath.read(jsonString, path);
        } catch (PathNotFoundException e) {
            return false;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
