package com.project.buyeritemservice.controller;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.buyeritemservice.pojo.BillPojo;
import com.project.buyeritemservice.service.BillService;


@CrossOrigin
@RestController
@RequestMapping("emart")

public class BillController {
	static Logger LOG = Logger.getLogger(BillController.class.getClass());
	
	@Autowired
	BillService billService;
	
	//end point for adding bills
	
	@PostMapping("bill")
	
	//addBill method requesting for bills

	BillPojo addBill(@RequestBody BillPojo billPojo)
	{
		BasicConfigurator.configure();
		LOG.info("entered controller add bill");

		LOG.info("exited controller add bill");
		return billService.addBill(billPojo);
	}
	
	
}