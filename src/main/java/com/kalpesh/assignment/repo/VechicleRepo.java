package com.kalpesh.assignment.repo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalpesh.assignment.model.Vehicle;

@Repository
@Transactional
public interface VechicleRepo extends JpaRepository<Vehicle, Long> {

	public Optional<Vehicle> findByLicensePlateNumber(String licensePlateNumber);

}
