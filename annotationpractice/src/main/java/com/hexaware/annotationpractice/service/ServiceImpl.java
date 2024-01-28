package com.hexaware.annotationpractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.annotationpractice.dao.IDao;

@Service
public class ServiceImpl implements IService {
    
	@Autowired
	IDao dao;
	
	@Override
	public void showService() {
		System.out.println("service is executed");
		System.out.println("you can see the dao object now " +dao);
		
		dao.showDao();
		
	}

}
