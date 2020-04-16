package com.cg.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.dao.IDao;


@Component("myser")
public class SerImpl implements IService{
private IDao dao;


public SerImpl() {
	System.out.println("service constructor");
}

//setter for IDC to inject the dependencies
//@Autowired
//@Qualifier("jdbc dao")
@Resource(name="${dbname}")
public void setDao(IDao dao) {
	System.out.println("inject the dependencies");
	this.dao=dao;
}


@Override
	public String viewName() {
	
		return dao.getName();
	}

}
