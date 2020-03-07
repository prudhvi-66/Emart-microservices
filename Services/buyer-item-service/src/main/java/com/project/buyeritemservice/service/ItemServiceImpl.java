package com.project.buyeritemservice.service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.buyeritemservice.dao.ItemDao;
import com.project.buyeritemservice.entity.CategoryEntity;
import com.project.buyeritemservice.entity.ItemEntity;
import com.project.buyeritemservice.entity.SellerSignupEntity;
import com.project.buyeritemservice.entity.SubCategoryEntity;
import com.project.buyeritemservice.pojo.CategoryPojo;
import com.project.buyeritemservice.pojo.ItemPojo;
import com.project.buyeritemservice.pojo.SellerSignupPojo;
import com.project.buyeritemservice.pojo.SubCategoryPojo;

import java.util.Iterator;

@Service
public class ItemServiceImpl implements ItemService {

	static Logger LOG = Logger.getLogger(ItemServiceImpl.class.getClass());

	@Autowired
	ItemDao itemDao;

	@Override

	public ItemPojo getItem(int itemId) {
	
		LOG.info("entered getItem()");

		ItemPojo itemPojo = null;
		Optional result = itemDao.findById(itemId);
		if (result.isPresent()) {

			ItemEntity itemEntity = (ItemEntity) result.get();
			SubCategoryEntity subCategoryEntity = itemEntity.getSubcategory();
			CategoryEntity categoryEntity = subCategoryEntity.getCategory();

			SellerSignupEntity sellersignupEntity = itemEntity.getSeller();
			
            //copying categoryentity to categorypojo
			
			CategoryPojo categoryPojo = new CategoryPojo(categoryEntity.getId(), categoryEntity.getName(),
					categoryEntity.getBrief());
			
			//copying subcategory entity and category pojo to subcatogorypojo 

			SubCategoryPojo subCategoryPojo = new SubCategoryPojo(subCategoryEntity.getId(),
					subCategoryEntity.getName(), categoryPojo, subCategoryEntity.getBrief(),
					subCategoryEntity.getGstPercent());
			
			//copying sellersignup entity and seller pojo to subcatogorypojo 

			SellerSignupPojo sellerPojo = new SellerSignupPojo(sellersignupEntity.getId(),
					sellersignupEntity.getUsername(), sellersignupEntity.getPassword(), sellersignupEntity.getCompany(),
					sellersignupEntity.getBrief(), sellersignupEntity.getGst(), sellersignupEntity.getAddress(),
					sellersignupEntity.getEmail(), sellersignupEntity.getWebsite(), sellersignupEntity.getContact());

			itemPojo = new ItemPojo(itemEntity.getId(), itemEntity.getName(), sellerPojo, subCategoryPojo,
					itemEntity.getPrice(), itemEntity.getDescription(), itemEntity.getStock(), itemEntity.getRemarks(),
					itemEntity.getImage()

					);
		}
		
		LOG.info("Exited getItem()");
		BasicConfigurator.resetConfiguration();
		return itemPojo;

	}

	@Override
	
	//retrieving all items
	
	public List<ItemPojo> getAllitems() {
		
		LOG.info("Entered getAllitems()");

		List<ItemPojo> allItemPojo = new ArrayList();
		Iterable<ItemEntity> allItemEntity = itemDao.findAll();
		Iterator itr = allItemEntity.iterator();
		while (itr.hasNext()) {
			ItemEntity itemEntity = (ItemEntity) itr.next();
			SubCategoryEntity subCategoryEntity = itemEntity.getSubcategory();
			CategoryEntity categoryEntity = subCategoryEntity.getCategory();
			SellerSignupEntity sellersignupEntity = itemEntity.getSeller();
			
			//copying all entities into respective pojos

			CategoryPojo categoryPojo = new CategoryPojo(categoryEntity.getId(), categoryEntity.getName(),
					categoryEntity.getBrief());
			SellerSignupPojo sellerPojo = new SellerSignupPojo(sellersignupEntity.getId(),
					sellersignupEntity.getUsername(), sellersignupEntity.getPassword(), sellersignupEntity.getCompany(),
					sellersignupEntity.getBrief(), sellersignupEntity.getGst(), sellersignupEntity.getAddress(),
					sellersignupEntity.getEmail(), sellersignupEntity.getWebsite(), sellersignupEntity.getContact());

			SubCategoryPojo subCategoryPojo = new SubCategoryPojo(subCategoryEntity.getId(),
					subCategoryEntity.getName(), categoryPojo, subCategoryEntity.getBrief(),
					subCategoryEntity.getGstPercent());
			ItemPojo itemPojo = new ItemPojo(itemEntity.getId(), itemEntity.getName(), sellerPojo, subCategoryPojo,
					itemEntity.getPrice(), itemEntity.getDescription(), itemEntity.getStock(), itemEntity.getRemarks(),
					itemEntity.getImage()

					);
			
			

			allItemPojo.add(itemPojo);

		}
	
		LOG.info("Exited getAllitems()");
		BasicConfigurator.resetConfiguration();
		return allItemPojo;

	}

}
