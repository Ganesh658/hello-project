package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.DatabaseFile;

@Repository
public interface DatabaseFileRepository extends JpaRepository<DatabaseFile, String> {
	//DatabaseFile findByVehicleNumber(String vehicleNumber);
	List<DatabaseFile> findByVehicleNumber(String vehicleNumber);
}
