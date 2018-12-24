package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.app.service.UserService;
import com.cwt.entity.PaneDetails;

@Controller
public class LoginController
{
	@Autowired
	private UserService userService;
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView getLoginApp()
	{
		
		//List list=userService.getUserDetails();
		return new ModelAndView("index");
	}
	
	
	
	@RequestMapping(value="/addData",method=RequestMethod.POST)
	public @ResponseBody  ResponseEntity<String> getAllList(@ModelAttribute("addDetails") PaneDetails paneDetails)
	{
		
		System.out.println(paneDetails.getSection_name());
		System.out.println(paneDetails.getRegion());
		
		//List<UserDetails> list=userService.getUserDetails();
		return new  ResponseEntity<String>("sucess",HttpStatus.OK);
	}
	
	
	
	

}
