package com.kapture.fieldservice.service;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;
import com.kapture.fieldservice.object.Config;
import com.kapture.fieldservice.object.Order;
import com.kapture.fieldservice.object.Product;
import com.kapture.fieldservice.repository.ConfigRepository;
import com.kapture.fieldservice.repository.ProductRepository;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class ProductService {

	public static final int CM_ID = 69;

	public static final String PRODUCT_CONFIG = "PRODUCT_CONFIG";

	private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ConfigRepository configRepository;

	public ResponseEntity<?> saveProduct(String requestBody, HttpServletRequest request) {
		String message = "";
		boolean status = false;
		HttpStatus httpStatus = HttpStatus.OK;
		JSONObject jsonObject = new JSONObject();
		try {
			logger.info("body in saveProduct() : " + requestBody);
			System.out.println(request.getContentType());
			if (StringUtils.isEmpty(requestBody)) {
				jsonObject.put("status", status);
				jsonObject.put("message", "request body is mandatory");
				return new ResponseEntity<JSONObject>(jsonObject, HttpStatus.BAD_REQUEST);
			}
			Config config = configRepository.findByCmIdAndConfigName(CM_ID, PRODUCT_CONFIG);
			if (config == null) {
				jsonObject.put("status", status);
				jsonObject.put("message", "config not found");
				return new ResponseEntity<JSONObject>(jsonObject, HttpStatus.NOT_FOUND);
			}
            try {
                String jConfig = config.getConfig();
                JSONObject pathObject = JSONObject.fromObject(jConfig).optJSONObject("path");
                Product product = new Product();
                product.setCmId(CM_ID);
                @SuppressWarnings("unchecked")
                Iterator<String> it = pathObject.keys();
                while (it.hasNext()) {
                    String key = it.next();
                    System.out.println(key + " " + pathObject.get(key));
                    String path = pathObject.optString(key);

                    String str[] = path.split("]");
                    Object value = "";
                    String arrayPathFinal = "";
                    if (str[0].indexOf('[') > -1) {
                        String arrayPath = str[0].substring(0, str[0].length() - 2);
                        if (isPathValid(arrayPath, requestBody)) {
                            Object obj = JsonPath.read(requestBody, "$." + arrayPath);
                            JSONArray jsonArray = JSONArray.fromObject(obj);
                            for (int i = 0; i < jsonArray.size(); i++) {
                                if (isPathValid(arrayPath + "[" + i + "]" + str[1], requestBody)) {
                                    value += JsonPath.read(requestBody, "$." + arrayPath + "[" + i + "]" + str[1]).toString() + ",";
                                    arrayPathFinal = arrayPath + "[" + i + "]" + str[1];

                                }
                            }
                        }
                    }
                    boolean isValid = str[0].indexOf('[') == -1 && isPathValid(path, requestBody);
                    if (isValid) {
                        value = JsonPath.read(requestBody, "$." + path);
                    } else {
                        path = arrayPathFinal;
                    }
                    value = (value + "").replaceAll(",$", "");
                    System.out.println("key " + key + " value " + value);
                    if (!key.contains("orderItems."))
                        PropertyUtils.setProperty(product, key, value);
                }
                product.setCreatedDate(Calendar.getInstance().getTimeInMillis());
                product.setLastUpdatedDate(Calendar.getInstance().getTimeInMillis());
                return new ResponseEntity<Object>(productRepository.save(product), HttpStatus.OK);
            } catch (Exception e) {
	                e.printStackTrace();
	            }

			status = true;
			message = "data added successfully";

		} catch (Exception e) {
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			message = "some error occurred";
			logger.error("error in saveProduct() ", e);
		}
		jsonObject.put("status", status);
		jsonObject.put("message", message);
		return new ResponseEntity<JSONObject>(jsonObject, httpStatus);
	}

	public ResponseEntity<?> getProductList() {
		String message = "";
		boolean status = false;
		HttpStatus httpStatus = HttpStatus.OK;
		JSONObject jsonObject = new JSONObject();
		try {
			List<Product> productListById = productRepository.getByCmId(CM_ID);
			if (CollectionUtils.isNotEmpty(productListById)) {
				status = true;
				message = "data found successfully";
				jsonObject.put("detail", productListById);
			} else {
				message = "data not found with cmId : " + CM_ID;
			}
		} catch (Exception e) {
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			message = "some error occurred";
			logger.error("error in getProductList() ", e);
		}
		jsonObject.put("status", status);
		jsonObject.put("message", message);
		return new ResponseEntity<JSONObject>(jsonObject, httpStatus);
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
