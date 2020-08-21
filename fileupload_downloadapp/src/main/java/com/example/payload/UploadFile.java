package com.example.payload;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class UploadFile implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String vehicleName;
	private String vehicleNumber;
	private String complaintAddress;
	private String complaintType;
	private MultipartFile file;
	
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getComplaintAddress() {
		return complaintAddress;
	}
	public void setComplaintAddress(String complaintAddress) {
		this.complaintAddress = complaintAddress;
	}
	public String getComplaintType() {
		return complaintType;
	}
	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "UploadFileRequest [vehicleName=" + vehicleName + ", vehicleNumber=" + vehicleNumber
				+ ", complaintAddress=" + complaintAddress + ", complaintType=" + complaintType + ", file=" + file
				+ "]";
	}
}
