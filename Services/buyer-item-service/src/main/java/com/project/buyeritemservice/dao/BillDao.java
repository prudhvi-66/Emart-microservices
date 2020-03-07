package com.project.buyeritemservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.buyeritemservice.entity.BillEntity;

@Repository
public interface BillDao extends JpaRepository<BillEntity, Integer> {

}
