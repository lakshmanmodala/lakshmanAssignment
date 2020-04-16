package com.cg.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("jpa dao")
@Lazy(true)
public class JpaDaoImpl implements IDao{
public JpaDaoImpl() {
	System.out.println("jpa dao constructor");
}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "jpa name";
	}

}
