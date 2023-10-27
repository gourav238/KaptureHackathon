package com.kapture.fieldservice.service;

import java.util.Calendar;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kapture.fieldservice.object.Supplier;
import com.kapture.fieldservice.repository.SupplierRepository;

import net.sf.json.JSONObject;

@Service
public class SupplierService {

	public static final int CM_ID = 69;

	private static final Logger logger = LoggerFactory.getLogger(SupplierService.class);

	@Autowired
	private SupplierRepository supplierRepository;

	public ResponseEntity<?> saveSupplier(Supplier supplier) {
		String message = "";
		boolean status = false;
		HttpStatus httpStatus = HttpStatus.OK;
		JSONObject jsonObject = new JSONObject();
		try {
			logger.info("body in saveSupplier() : " + supplier);
			if (supplier == null) {
				jsonObject.put("status", status);
				jsonObject.put("message", "request body is mandatory");
				return new ResponseEntity<JSONObject>(jsonObject, HttpStatus.BAD_REQUEST);
			}
			supplier.setCreatedDate(Calendar.getInstance().getTimeInMillis());
			supplier.setLastUpdatedDate(Calendar.getInstance().getTimeInMillis());
			supplier.setEnable(true);
			supplier.setCmId(CM_ID);
			supplierRepository.save(supplier);
			status = true;
			message = "data added successfully";
		} catch (Exception e) {
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			message = "some error occurred";
			logger.error("error in saveSupplier() ", e);
		}
		jsonObject.put("status", status);
		jsonObject.put("message", message);
		return new ResponseEntity<JSONObject>(jsonObject, httpStatus);
	}

	public ResponseEntity<?> getSupplierList() {
		String message = "";
		boolean status = false;
		HttpStatus httpStatus = HttpStatus.OK;
		JSONObject jsonObject = new JSONObject();
		try {
			List<Supplier> getByCmId = supplierRepository.getByCmId(CM_ID);
			if (CollectionUtils.isNotEmpty(getByCmId)) {
				status = true;
				message = "data found successfully";
				jsonObject.put("details", getByCmId);
			} else {
				message = "data not found";
			}
		} catch (Exception e) {
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			message = "some error occurred";
			logger.error("error in saveSupplier() ", e);
		}
		jsonObject.put("status", status);
		jsonObject.put("message", message);
		return new ResponseEntity<JSONObject>(jsonObject, httpStatus);
	}
	
	public ResponseEntity<?> disableSupplierById(Supplier supplier) {
		String message = "";
		boolean status = false;
		HttpStatus httpStatus = HttpStatus.OK;
		JSONObject jsonObject = new JSONObject();
		try {
			logger.info("supplier in disableSupplierById() : " + supplier);
			if (supplier == null || StringUtils.isEmpty(supplier.getId())) {
				jsonObject.put("status", status);
				jsonObject.put("message", "supplier is mandatory");
				return new ResponseEntity<JSONObject>(jsonObject, HttpStatus.BAD_REQUEST);
			}
			Supplier supplierById = supplierRepository.findById(supplier.getId()).get();
			supplierById.setEnable(false);
			supplierById.setLastUpdatedDate(Calendar.getInstance().getTimeInMillis());
			supplierRepository.save(supplierById);
			status = true;
			message = "data edited successfully";
		} catch (Exception e) {
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			message = "some error occurred";
			logger.error("error in saveSupplier() ", e);
		}
		jsonObject.put("status", status);
		jsonObject.put("message", message);
		return new ResponseEntity<JSONObject>(jsonObject, httpStatus);
	}
}
