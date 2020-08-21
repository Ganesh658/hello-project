package com.example.service;

import java.util.List;

import com.example.model.DatabaseFile;
import com.example.payload.UploadFile;

public interface DatabaseFileService {
	public DatabaseFile storeVehicleDetails(UploadFile uploadFile);
	//public DatabaseFile getVehicleNumber(String vehicleNumber);
	public List<DatabaseFile> downloadVehicleDetailsByVehicleNumber(String vehicleNumber);
}
