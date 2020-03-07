package com.project.buyeritemservice.controller;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.buyeritemservice.pojo.ItemPojo;
import com.project.buyeritemservice.service.ItemService;

@CrossOrigin
@RestController
@RequestMapping("emart")
public class ItemController {

static Logger LOG = Logger.getLogger(ItemController.class.getClass());
	
	@Autowired
	ItemService itemService;
	
	//end point for retrieving an item  

	@GetMapping("/item/{itemId}")
	ItemPojo getItem(@PathVariable("itemId") int itemId) {
		BasicConfigurator.configure();
		LOG.info("entered controller get item");

		LOG.info("exited controller get item");
		
		return itemService.getItem(itemId);

	}

	//end point to retrieve all items 
	
	@GetMapping("/item/all")
	List<ItemPojo> getAllitems() {
		BasicConfigurator.configure();
		LOG.info("entered controller get allItems");
		LOG.info("exited controller get allItems");

		return itemService.getAllitems();
	}

}
