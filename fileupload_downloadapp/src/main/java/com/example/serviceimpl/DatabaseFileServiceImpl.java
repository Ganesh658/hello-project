package com.example.serviceimpl;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.exception.FileStorageException;
import com.example.model.DatabaseFile;
import com.example.payload.UploadFile;
import com.example.repository.DatabaseFileRepository;
import com.example.service.DatabaseFileService;

@Service
public class DatabaseFileServiceImpl implements DatabaseFileService {

	@Autowired
    private DatabaseFileRepository databaseFileRepository;
	
	public DatabaseFile storeVehicleDetails(UploadFile uploadFile) {
		System.out.println("Entering - DatabaseFileServiceImpl.storeVehicleDetails(UploadFile) - uploadFile : "+uploadFile);
		DatabaseFile databaseFile = null;
		String fileType = "";
		byte[] vehiclePhoto;
		
		try {
			if(uploadFile != null && !uploadFile.getFile().isEmpty()){
				fileType = uploadFile.getFile().getContentType();
				vehiclePhoto = uploadFile.getFile().getBytes();
				databaseFile = new DatabaseFile(uploadFile.getVehicleName(), uploadFile.getVehicleNumber(), uploadFile.getComplaintAddress(), uploadFile.getComplaintType(), fileType, vehiclePhoto);
				return databaseFileRepository.save(databaseFile);
			}
		} catch (IOException ex) {
            throw new FileStorageException("Could not store Vehicle Details. Please try again!", ex);
        }
		return databaseFile;
	}
	
	/*public DatabaseFile getVehicleNumber(String vehicleNumber) {
		System.out.println("Entering - DatabaseFileServiceImpl.getVehicleNumber(String - vehicleNumber : "+vehicleNumber);
        return dbFileRepository.findByVehicleNumber(vehicleNumber);
    }*/

	@Override
	public List<DatabaseFile> downloadVehicleDetailsByVehicleNumber(String vehicleNumber) {
		return databaseFileRepository.findByVehicleNumber(vehicleNumber);
	}
}
