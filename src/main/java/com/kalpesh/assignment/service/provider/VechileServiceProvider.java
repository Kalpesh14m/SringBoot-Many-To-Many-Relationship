package com.kalpesh.assignment.service.provider;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalpesh.assignment.constant.Constant;
import com.kalpesh.assignment.exception.AlreadyRegisteredException;
import com.kalpesh.assignment.model.Vehicle;
import com.kalpesh.assignment.model.dto.VehicleDTO;
import com.kalpesh.assignment.repo.VechicleRepo;
import com.kalpesh.assignment.service.VechileService;

@Service
public class VechileServiceProvider implements VechileService {

	@Autowired
	private VechicleRepo vechicleRepo;

	public void registerVehicle(VehicleDTO request) {
		if (vechicleRepo.findByLicensePlateNumber(request.getLicensePlateNumber()).isPresent()) {
			throw new AlreadyRegisteredException(Constant.VEHICLE_DETAILS_ALREADY_REGISTER);
		}
		Vehicle vechicleEntity = new Vehicle();
		BeanUtils.copyProperties(request, vechicleEntity);
		vechicleRepo.save(vechicleEntity);
	}

}