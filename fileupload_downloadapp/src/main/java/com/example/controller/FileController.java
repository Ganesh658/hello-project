package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.DatabaseFile;
import com.example.payload.UploadFile;
import com.example.service.DatabaseFileService;

@Controller
public class FileController {
	
	@Autowired
    private DatabaseFileService databaseFileService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
    public String home(ModelMap model){
		return "home"; 
    }
	@RequestMapping(value="/vehiclecomplain", method = RequestMethod.GET)
    public String redirecting(ModelMap model){
	  return "vehiclecomplain";
	}
	
	@RequestMapping(value="/uploadFile", method = RequestMethod.POST)
	public String uploadFile(ModelMap model, @ModelAttribute("user") UploadFile uploadFile) { 
		System.out.println("Entering - FileController.uploadFile(ModelMap, UploadFile) - uploadFile : "+uploadFile);
		DatabaseFile databaseFile = databaseFileService.storeVehicleDetails(uploadFile);
        if(databaseFile != null){
			 model.put("uploadFileSuccess", "Vehicle Number - "+databaseFile.getVehicleNumber()+" details added successfully .");
			 return "welcome";
		}else{
			 model.put("uploadFileFailed", "Vehicle Details not able to upload");
			 return "redirect:/";
		}
    }
	
   /* @GetMapping("/downloadFile/{vehicleNumber}")
    public ResponseEntity<Resource> downloadVehicleDetails(@PathVariable String vehicleNumber) {
    	System.out.println("Entering - FileController.downloadVehicleDetails(String, HttpServletRequest) - vehicleNumber::"+vehicleNumber);
        DatabaseFile databaseFile = databaseFileService.getVehicleNumber(vehicleNumber);
        
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(databaseFile.getFileType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; vehicleName=\"" + databaseFile.getVehicleName() + "\"")
                .body(new ByteArrayResource(databaseFile.getVehiclePhoto()));
    }*/
    
    @GetMapping("/downloadFile/{vehicleNumber}")
    public String downloadVehicleDetailsByVehicleNumber(ModelMap model, @PathVariable String vehicleNumber) {
    	System.out.println("Entering - FileController.downloadVehicleDetails(String, HttpServletRequest) - vehicleNumber::"+vehicleNumber);
        List<DatabaseFile> databaseFile = databaseFileService.downloadVehicleDetailsByVehicleNumber(vehicleNumber);
        System.out.println("databaseFile - : "+databaseFile);
        model.put("databaseFile", databaseFile);
        return "viewdetails";
    }
}
