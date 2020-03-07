package com.project.buyeritemservice.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.buyeritemservice.entity.SubCategoryEntity;



@Repository
public interface SubCategoryDao extends JpaRepository<SubCategoryEntity, Integer> 
{

	
}
