package com.project.loginservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.loginservice.entity.BillDetailsEntity;





@Repository

public interface BillDetailsDao extends JpaRepository<BillDetailsEntity,Integer> {

}
