package com.project.buyeritemservice.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.buyeritemservice.entity.CategoryEntity;



@Repository
public interface CategoryDao extends JpaRepository<CategoryEntity, Integer>
{

}
