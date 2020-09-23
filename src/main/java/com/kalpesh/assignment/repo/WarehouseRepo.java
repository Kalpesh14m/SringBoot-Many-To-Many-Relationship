package com.kalpesh.assignment.repo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalpesh.assignment.model.Warehouse;

@Repository
@Transactional
public interface WarehouseRepo extends JpaRepository<Warehouse, Long> {

	public Optional<Warehouse> findBywName(String getwName);

}
