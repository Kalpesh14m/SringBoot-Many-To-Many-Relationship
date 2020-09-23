package com.kalpesh.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalpesh.assignment.constant.Constant;
import com.kalpesh.assignment.model.dto.VehicleDTO;
import com.kalpesh.assignment.response.Response;
import com.kalpesh.assignment.service.VechileService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/vehicle")
@Api(value = "Vehicle Controller")
public class VechileController {
	@Autowired
	private VechileService vehicleService;

	@ApiOperation(value = "Register new Vehicle in database")
	@PostMapping(value = "/")
	public ResponseEntity<Response> register(@RequestBody VehicleDTO request) {
		vehicleService.registerVehicle(request);
		return ResponseEntity.status(HttpStatus.OK)
				.body(new Response(Constant.VEHICLE_DETAILS_REGISTER_SUCESSFULLY, Constant.OK_RESPONSE_CODE));
	}
}
