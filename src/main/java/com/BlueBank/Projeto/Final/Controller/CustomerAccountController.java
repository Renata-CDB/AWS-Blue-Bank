package com.BlueBank.Projeto.Final.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BlueBank.Projeto.Final.Model.CustomerAccount;
import com.BlueBank.Projeto.Final.Service.CustomerAccountService;

@RestController
@RequestMapping("api/v1/customerAccount")

public class CustomerAccountController 
{
	private final CustomerAccountService customerAccountService;
	
	public CustomerAccountController(CustomerAccountService customerAccountService)
	
	{
		this.customerAccountService = customerAccountService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CustomerAccount> getById(@PathVariable Long id) 
	{
		CustomerAccount customerAccount = customerAccountService.getById(id);
		return ResponseEntity.ok(customerAccount);
		
	}
	
}   

