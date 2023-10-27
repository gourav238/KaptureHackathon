package com.kapture.fieldservice.service;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;
import com.kapture.fieldservice.object.Config;
import com.kapture.fieldservice.object.Order;
import com.kapture.fieldservice.repository.ConfigRepository;

import net.sf.json.JSONObject;

@Service
public class OrderService {
    private static final String CONFIG_TYPE = "ORDER_CONFIG";
    private static final int    CMID        = 69;
    @Autowired
    ConfigRepository            configRepository;

    public ResponseEntity< ? > add(String requestPayload, HttpServletRequest request) {
        Config config = configRepository.findByCmIdAndConfigName(CMID, CONFIG_TYPE);
        System.out.println("config "+config);
        if (config != null) {
            
            String jConfig = config.getConfig();
            JSONObject path = JSONObject.fromObject(jConfig).optJSONObject("path");
            Order order = new Order();
            
            Iterator<String> it = path.keys();
            while (it.hasNext())
            {
                String key = it.next();
                System.out.println(key +" "+path.get(key));
            }
//            String path = ticketAssociateObjectFieldsMappingConfig.getJsonpath();
//
//            String str[] = path.split("]");
//            Object value = "";
//            String arrayPathFinal = "";
//            if (str[0].indexOf('[') > -1) {
//                String arrayPath = str[0].substring(0, str[0].length() - 2);
//
//                if (isPathValid(arrayPath, requestPayload)) {
//                    JSONArray jsonArray = JsonPath.read(requestPayload, "$." + arrayPath);
//
//                    for (int i = 0; i < jsonArray.size(); i++) {
//                        if (isPathValid(arrayPath + "[" + i + "]" + str[1], requestPayload)) {
//                            value += JsonPath.read(requestPayload, "$." + arrayPath + "[" + i + "]" + str[1]).toString() + ",";
//                            arrayPathFinal = arrayPath + "[" + i + "]" + str[1];
//                        }
//                    }
//                }
//            }
//
//            boolean isValid = str[0].indexOf('[') == -1 && isPathValid(path, requestPayload);
//            if (isValid) {
//                value = JsonPath.read(requestPayload, "$." + path);
//            } else {
//                path = arrayPathFinal;
//            }
//
//            value = (value + "").replaceAll(",$", "");
////            if (!isNotOvrride || isPathValid(path, requestPayload)) {
//                PropertyUtils.setProperty(ticketAssociateValue, ticketAssociateObjectFieldsMappingConfig.getAttribute(), value);
//
////            }
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
