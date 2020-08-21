package com.example.springwebex.service;

import java.util.List;

import com.example.springwebex.model.DatabaseFile;

public interface DatabaseFileService {
	public List<DatabaseFile> downloadVehicleDetailsByVehicleNumber(String vehicleNumber);
}
