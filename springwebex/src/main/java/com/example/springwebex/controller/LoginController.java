package com.example.springwebex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springwebex.model.DatabaseFile;
import com.example.springwebex.model.User;
import com.example.springwebex.service.DatabaseFileService;
import com.example.springwebex.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	DatabaseFileService databaseFileService;

	@RequestMapping(value="/", method = RequestMethod.GET)
    public String showVeiwUserDetails(ModelMap model){
		return "login"; 
    }
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
		return "login"; 
    }
	
	@RequestMapping("/userRegistration")    
    public String showform(ModelMap model){    
		model.put("command", new User());  
        return "userRegistration";   
    }    
	
	@RequestMapping(value="/getAllUserDetails",  method = RequestMethod.GET)
    public String getAllUserDetails(ModelMap model) {
		List<User> usersList = loginService.getAllUserDetails();
		 model.put("usersList", usersList);
        return "viewUserDetails";
    }
	
	@RequestMapping(value="/addUserDetails", method = RequestMethod.POST)
    public String addUserDetails(@ModelAttribute("user") User user) {
		User newUser =  loginService.save(user);
		if(newUser != null){
			return "redirect:/userRegistration";
		}else{
			return "redirect:/userRegistration";
		}
    }
	
	 @RequestMapping(value="/deleteUserDetailsById/{uid}",method = RequestMethod.GET)    
	   public String deleteUserDetailsById(ModelMap model,@PathVariable Long uid){  
		 int deletedRecords = 0;
		 deletedRecords = loginService.deleteUserDetailsById(uid);
		 if(deletedRecords > 0){
			 model.put("deletedUserStatus", "Sussessfully deleted User Details for uid :"+uid);
		 }else{
			 model.put("deletedUserStatus", "User not deleted");
		 }
	     return "redirect:/getAllUserDetails";    
	  }    
	
	/*@RequestMapping(value="/verifyLoginDetails", method = RequestMethod.GET)
    public String validateUser(ModelMap model, @RequestParam String username, @RequestParam String password){
		System.out.println("Entering - LoginController.validateUser(ModelMap, String, String) - username : "+username+" | password : "+password);
        boolean isValidUser = loginService.validateUser(username, password);
        if (!isValidUser) {
            model.put("errorMessage", "You are not Recoginsed Person to proceed");
            return "login";
        }
        model.put("username", username);
        return "welcome";
    }
    */
	 @RequestMapping(value="/verifyLoginDetails", method = RequestMethod.GET)
	    public String validateUser(ModelMap model, @RequestParam String username, @RequestParam String password, @RequestParam String purpose){
			System.out.println("Entering - LoginController.validateUser(ModelMap, String, String, String) - username : "+username+" | password : "+password+" | purpose : "+purpose);
	        boolean isValidUser = loginService.validateUser(username, password, purpose);
			//boolean isValidUser = loginService.validateUser(username, password);
	        if (!isValidUser) {
	            model.put("errorMessage", "You are not an Recognised Person");
	            return "login";
	        }
	        model.put("username", username);
	        return "welcome";
	    }

	@RequestMapping(value="/searchvehicleinfo", method = RequestMethod.GET)
    public String showvehicleinfo(ModelMap model){
		return "searchvehicleinfo"; 
    }
	
	/*@RequestMapping(value="/vehicleinfo", method = RequestMethod.GET)
    public String vehicleinfo(ModelMap model){
		return "redirect:/downloadFile/{vehicleNumber}"; 
    }
    */
	
	
	
	 //@GetMapping("/downloadFile/{vehicleNumber}")
	@GetMapping("/downloadFile")
	    public String downloadVehicleDetailsByVehicleNumber(ModelMap model, @RequestParam String vehicleNumber) {
	    	System.out.println("Entering - FileController.downloadVehicleDetails(String, HttpServletRequest) - vehicleNumber::"+vehicleNumber);
	        List<DatabaseFile> databaseFile = databaseFileService.downloadVehicleDetailsByVehicleNumber(vehicleNumber);
	        System.out.println("databaseFile - : "+databaseFile);
	       // model.addAttribute("databaseFile", findByVehicleNumber(vehicleNumber));
	        model.put("databaseFile", databaseFile);
	        return "viewdetails";
	    }
}
