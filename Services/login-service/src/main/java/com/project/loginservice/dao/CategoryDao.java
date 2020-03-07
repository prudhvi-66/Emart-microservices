package com.project.loginservice.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.loginservice.entity.CategoryEntity;




@Repository
public interface CategoryDao extends JpaRepository<CategoryEntity, Integer>
{

}
