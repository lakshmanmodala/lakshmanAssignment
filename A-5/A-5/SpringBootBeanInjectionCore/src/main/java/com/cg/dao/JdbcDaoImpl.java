package com.cg.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("jdbc dao")
@Lazy(true)
public class JdbcDaoImpl implements IDao {

	
	public JdbcDaoImpl() {
		System.out.println("JDBC DAO constructor");
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "jdbc name";
	}

}
