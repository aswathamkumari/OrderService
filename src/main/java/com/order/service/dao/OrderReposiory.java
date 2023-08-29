package com.order.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.service.model.CustomerOrder;

@Repository
public interface OrderReposiory extends JpaRepository< CustomerOrder,Integer>{

}
