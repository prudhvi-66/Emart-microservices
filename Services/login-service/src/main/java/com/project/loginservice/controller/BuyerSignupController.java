package com.project.loginservice.controller;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.loginservice.pojo.BuyerSignupPojo;
import com.project.loginservice.service.BuyerSignupService;




@CrossOrigin
@RestController
@RequestMapping("emart")
public class BuyerSignupController {
	
	static Logger LOG = Logger.getLogger(BuyerSignupController.class.getClass());

	@Autowired
	BuyerSignupService buyerSignupService;

	@GetMapping("validate")
	
	//calling validateBuyer method 
	
	BuyerSignupPojo validateBuyerSignup(@RequestHeader("Authorization") String data) {
		
		BasicConfigurator.configure();
		LOG.info("entered controller validate buyer");
		LOG.info("exited controller validate buyer");
		
		String token[] = data.split(":");
		BuyerSignupPojo buyerSignupPojo = new BuyerSignupPojo();
		buyerSignupPojo.setUsername(token[0]);
		buyerSignupPojo.setPassword(token[1]);
		return buyerSignupService.validateBuyerSignup(buyerSignupPojo);
	}

	//end point for retrieving an buyer
	@GetMapping("buyer/{buyerId}")
	BuyerSignupPojo getBuyer(@PathVariable("buyerId") Integer buyerId) {
		
		BasicConfigurator.configure();
		LOG.info("entered controller get buyer");

		LOG.info("exited controller get buyer");
		return buyerSignupService.getBuyer(buyerId);
	}

}
