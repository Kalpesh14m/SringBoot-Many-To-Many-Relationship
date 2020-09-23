package com.kalpesh.assignment.constant;

import org.springframework.http.HttpStatus;

public class Constant {

	private Constant() {
	}

	public static final int OK_RESPONSE_CODE = 200;
	public static final int CREATED_RESPONSE_CODE = 201;
	public static final int ALREADY_EXIST_EXCEPTION_STATUS = 208;
	public static final int NOTE_NOT_FOUND_EXCEPTION_STATUS = 300;
	public static final int BAD_REQUEST_RESPONSE_CODE = 400;
	public static final int NOT_FOUND_RESPONSE_CODE = 404;
	public static final int BAD_GATEWAY_RESPONSE_CODE = 502;
	public static final int ACCEPT_RESPONSE_CODE = HttpStatus.ACCEPTED.value();
	public static final int EXPECTATION_FAILED_RESPONSE_CODE = HttpStatus.EXPECTATION_FAILED.value();

	public static final String WAREHOUSE_DETAILS_FOUND = "Warehouse Found";
	public static final String WAREHOUSE_DETAILS_NOT_FOUND = "Warehouse not found!";
	public static final String WAREHOUSE_DETAILS_REGISTER_SUCESSFULLY = "Warehouse Registration Sucessfully Done.";
	public static final String WAREHOUSE_DETAILS_REGISTERATION_FAILED = "Warehouse Registration Failed";
	public static final String WAREHOUSE_DETAILS_ALREADY_REGISTER = "Warehouse Already register";
	public static final String WAREHOUSE_DETAILS_UPDATED_SUCESSFULLY = "Warehouse Details Updated Successfully";
	public static final String WAREHOUSE_DETAILS_UPDATION_FAILED = "Warehouse Details Updation failed";
	public static final String WAREHOUSE_DETAILS_DELETED_SUCESSFULLY = "Warehouse Deleted Successfully";

	public static final String VEHICLE_DETAILS_FOUND = "Vehicle Found";
	public static final String VEHICLE_DETAILS_NOT_FOUND = "Vehicle not found!";
	public static final String VEHICLE_DETAILS_REGISTER_SUCESSFULLY = "Vehicle Registration Sucessfully Done.";
	public static final String VEHICLE_DETAILS_REGISTERATION_FAILED = "Vehicle Registration Failed";
	public static final String VEHICLE_DETAILS_ALREADY_REGISTER = "Vehicle Already register";
	public static final String VEHICLE_DETAILS_UPDATED_SUCESSFULLY = "Vehicle Details Updated Successfully";
	public static final String VEHICLE_DETAILS_UPDATION_FAILED = "Vehicle Details Updation failed";
	public static final String VEHICLE_DETAILS_DELETED_SUCESSFULLY = "Vehicle Deleted Successfully";

}