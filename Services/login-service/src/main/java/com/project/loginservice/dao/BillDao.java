package com.project.loginservice.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.loginservice.entity.BillEntity;


@Repository
public interface BillDao extends JpaRepository<BillEntity,Integer> {

}
