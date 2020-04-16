package com.cg.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.entity.Account;
import com.cg.entity.TransferBean;
import com.cg.exceptions.AccountException;
import com.cg.service.AccountService;

@Controller
public class AccountController {

	@Autowired
	private AccountService service;
	
	@GetMapping("/viewall")
	public String viewAllAccount(Model model) {
		model.addAttribute("alist", service.viewAccount());
		return "AccountViewPage";
	}
	
	@GetMapping("/showaddform")
	public String displayAddForm(Model model) {
		model.addAttribute("abean", new Account());
		return "AddAccountPage";
	}
	
	@PostMapping("/add")
	public String addAccount(@Valid @ModelAttribute("abean") Account account,BindingResult br,Model model) {
       if(br.hasErrors())
    	   return "AddAccountPage";
       try {
    	   service.addAccount(account);
    	   model.addAttribute("msg", "Account Added Successfully");
    	   return "HomePage";
       }catch(Exception ex) {
    	   model.addAttribute("msg", "ID already exists");
    	   return "AddAccountPage";
       }
	}
	
	@GetMapping("/showtransfer")
	public String displayTransferFundPg(Model model) {
		model.addAttribute("tbean", new TransferBean());
		return "TransferformPage";
	}
	
	@PostMapping("/submittransfer")
	public String processTransferFund(@Valid @ModelAttribute("tbean") TransferBean tbean,BindingResult br,Model model) {
		if(br.hasErrors())
			return "TransferformPage";
		try {
			service.transferFund(tbean.getFromAccountId(), tbean.getToAccountId(), tbean.getAmt());
			model.addAttribute("msg","Fund Transfered Successfully");
			return "HomePage";
		}catch(AccountException ex) {
			model.addAttribute("msg", ex.getMessage());
			return "TransferformPage";
		}
	}
}
