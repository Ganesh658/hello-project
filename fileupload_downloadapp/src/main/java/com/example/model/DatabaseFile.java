package com.example.model;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="vehicle")
public class DatabaseFile implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	private String vehicleName;
	private String vehicleNumber;
	private String complaintAddress;
	private String complaintType;
	private String fileType;
	@Lob
	private byte[] vehiclePhoto;
	
	public DatabaseFile() {
		super();
	}

	public DatabaseFile(String vehicleName, String vehicleNumber, String complaintAddress, String complaintType,
			String fileType, byte[] vehiclePhoto) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleNumber = vehicleNumber;
		this.complaintAddress = complaintAddress;
		this.complaintType = complaintType;
		this.fileType = fileType;
		this.vehiclePhoto = vehiclePhoto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getVehiclePhoto() {
		return vehiclePhoto;
	}

	public void setVehiclePhoto(byte[] vehiclePhoto) {
		this.vehiclePhoto = vehiclePhoto;
	}

	@Override
	public String toString() {
		return "DatabaseFile [id=" + id + ", vehicleName=" + vehicleName + ", vehicleNumber=" + vehicleNumber
				+ ", complaintAddress=" + complaintAddress + ", complaintType=" + complaintType + ", fileType="
				+ fileType + ", vehiclePhoto=" + Arrays.toString(vehiclePhoto) + "]";
	}
}
