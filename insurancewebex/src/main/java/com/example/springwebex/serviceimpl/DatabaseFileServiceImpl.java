package com.example.springwebex.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springwebex.model.DatabaseFile;
import com.example.springwebex.repository.DatabaseFileRepository;
import com.example.springwebex.service.DatabaseFileService;

@Service
public class DatabaseFileServiceImpl implements DatabaseFileService {

	@Autowired
    private DatabaseFileRepository databaseFileRepository;

	public List<DatabaseFile> downloadVehicleDetailsByVehicleNumber(String vehicleNumber) {
		return databaseFileRepository.findByVehicleNumber(vehicleNumber);
	}
}
