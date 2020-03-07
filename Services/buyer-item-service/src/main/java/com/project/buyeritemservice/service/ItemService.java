package com.project.buyeritemservice.service;

import java.util.List;

import com.project.buyeritemservice.pojo.ItemPojo;

public interface ItemService {

	ItemPojo getItem(int itemId);

	List<ItemPojo> getAllitems();

}
