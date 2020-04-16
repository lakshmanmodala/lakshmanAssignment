package com.cg.dao;

import java.util.List;

import com.cg.entity.Account;
import com.cg.exceptions.AccountException;

public interface AccountDao {

	boolean addAccount(Account account);
	boolean editAccount(Account account);
	Account getAccount(int aid) throws AccountException;
	public List<Account> getAccount();
}
