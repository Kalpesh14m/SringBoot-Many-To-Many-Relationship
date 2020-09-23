package com.kalpesh.assignment.service.provider;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalpesh.assignment.constant.Constant;
import com.kalpesh.assignment.exception.AlreadyRegisteredException;
import com.kalpesh.assignment.model.Warehouse;
import com.kalpesh.assignment.model.dto.WarehouseDTO;
import com.kalpesh.assignment.repo.WarehouseRepo;
import com.kalpesh.assignment.service.WarehouseService;

@Service
public class WarehouseServiceProvider implements WarehouseService {

	@Autowired
	private WarehouseRepo warehouseRepo;

	public void registerWarehouse(WarehouseDTO request) {
		if (warehouseRepo.findBywName(request.getwName()).isPresent())
			throw new AlreadyRegisteredException(Constant.WAREHOUSE_DETAILS_ALREADY_REGISTER);
		Warehouse warehouseEntity = new Warehouse();
		BeanUtils.copyProperties(request, warehouseEntity);
		warehouseRepo.save(warehouseEntity);
	}
}