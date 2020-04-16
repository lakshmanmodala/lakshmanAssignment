package com.cg.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Account;
import com.cg.entity.TransferBean;
import com.cg.exceptions.AccountException;
import com.cg.service.AccountService;

@RestController
public class TransferController {

	@Autowired
	private AccountService ser;
	
	@CrossOrigin
	@GetMapping("/viewall")
	public List<Account> getAccount(){
		return ser.viewAccount();
	}
	
	@CrossOrigin
	@PostMapping("/add")
	public String addAccount(@Valid @RequestBody Account account,BindingResult br)
	throws AccountException{
		String err="";
		if(br.hasErrors()) {
			List<FieldError> errors=br.getFieldErrors();
			for(FieldError error:errors)
				err+=error.getDefaultMessage()+"<br/>";
			throw new AccountException(err);
		}
		try {
			ser.addAccount(account);
			return "Account Added";
		}catch(DataIntegrityViolationException ex) {
			throw new AccountException("ID already exists");
		}
	}
	
	@CrossOrigin
	@PostMapping("/transfer")
	public String transferAccount(@Valid @RequestBody TransferBean tbean,BindingResult br)
	 throws AccountException{
		String err="";
		if(br.hasErrors()) {
			List<FieldError> errors=br.getFieldErrors();
			for(FieldError error:errors)
				err+=error.getDefaultMessage()+"<br/>";
			throw new AccountException(err);
		}
		ser.transferFund(tbean.getFromAccountId(), tbean.getToAccountId(), tbean.getAmt());
		return "Amount Transfered";
	}
}
