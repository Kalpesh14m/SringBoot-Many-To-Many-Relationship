package com.kalpesh.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalpesh.assignment.constant.Constant;
import com.kalpesh.assignment.model.dto.WarehouseDTO;
import com.kalpesh.assignment.response.Response;
import com.kalpesh.assignment.service.WarehouseService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/warehouse")
@Api(value = "Warehouse Controller")
public class WarehouseController {
	@Autowired
	private WarehouseService warehouseService;

	@ApiOperation(value = "Register new Warehouse in database")
	@PostMapping(value = "/")
	public ResponseEntity<Response> register(@RequestBody WarehouseDTO request) {
		warehouseService.registerWarehouse(request);
		return ResponseEntity.status(HttpStatus.OK)
				.body(new Response(Constant.WAREHOUSE_DETAILS_REGISTER_SUCESSFULLY, Constant.OK_RESPONSE_CODE));
	}
}
