package com.example.springwebex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.springwebex.model.DatabaseFile;
import com.example.springwebex.model.User;

@Repository
public interface DatabaseFileRepository extends JpaRepository<DatabaseFile, String> {
	//DatabaseFile findByVehicleNumber(String vehicleNumber);
	List<DatabaseFile> findByVehicleNumber(String vehicleNumber);
	//@Query(value = "SELECT u FROM Vehicle u WHERE u.vehicleNumber = :vehicleNumber")
	//public DatabaseFile validatedatabaseFile(@Param("vehicleNumber") String vehicleNumber);

}
