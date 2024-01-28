package com.hexaware.annotationpractice.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements IDao{

	@Override
	public void showDao() {
		System.out.println("dao got executed");
		
	}

}
