package com.BlueBank.Projeto.Final.Controller;

/*import java.awt.print.Pageable;*/

/*import org.springframework.data.domain.Page;*/
import org.springframework.http.ResponseEntity;
/*import org.springframework.web.bind.annotation.DeleteMapping;*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/*import org.springframework.web.bind.annotation.PostMapping;*/
/*import org.springframework.web.bind.annotation.PutMapping;*/
/*import org.springframework.web.bind.annotation.RequestBody;*/
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
	
	/*@GetMapping
	public ResponseEntity<Page<CustomerAccount>> getAll(Pageable pageable){
		 Page<CustomerAccount> listaCustomerAccount = customerAccountService.findAll(pageable);		
		return ResponseEntity.ok().body(listaCustomerAccount);
	}*/
	
	@GetMapping("/{id}")
	public ResponseEntity<CustomerAccount> getById(@PathVariable Long id){ 
		CustomerAccount customerAccount = customerAccountService.getById(id);
		return ResponseEntity.ok(customerAccount);
		
	}
	
	/*@PostMapping
	public ResponseEntity<CustomerAccount> create(@RequestBody CustomerAccount customerAccount){
		CustomerAccount c = customerAccountService.create((customerAccount);)
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(c.getId()).toUri();	
		
		return ResponseEntity.created(location).body(c);
	}*/
	
   /*@PutMapping("/{id}")
    public ResponseEntity<CustomerAccount> update(@RequestBody CustomerAccount CustomerAccount, @PathVariable Long id){
	   CustomerAccount = customerAccountService.update(customerAccount, id);
	//return ResponseEntity.noContent().build();
	return ResponseEntity.ok().body(customerAccount);
	}*/
	
	/*@DeleteMapping("/{id}")
	public ResponseEntity<customerAccount> delete(@PathVariable Long id){
		customerAccountService.delete(id);
		return ResponseEntity.noContent().build();
	}*/
   
   }


