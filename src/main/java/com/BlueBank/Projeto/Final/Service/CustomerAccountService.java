package com.BlueBank.Projeto.Final.Service;


/*import java.awt.print.Pageable;*/
import java.util.Optional;

/*import org.springframework.data.domain.Page;*/
import org.springframework.stereotype.Service;

import com.BlueBank.Projeto.Final.Model.CustomerAccount;
import com.BlueBank.Projeto.Final.Repository.CustomerAccountRepository;

@Service
public class CustomerAccountService 
{
	
    private CustomerAccountRepository customerAccountRepository;
	
    public CustomerAccountService (CustomerAccountRepository customerAccountRepository) 
	{
		this.customerAccountRepository =customerAccountRepository;
	}
	
	    
   //Paginado
	/*public Page<CustomerAccount> findAll(Pageable pageable){
	   	Page<CustomerAccount> list = CustomerAccountRepository.findAll(pageable);
	   	return list;
	}*/
			
	
	public CustomerAccount getById(Long id) 
	{
		Optional<CustomerAccount> customerAccount = customerAccountRepository.findById(id);
		CustomerAccount c = customerAccount.orElseThrow(() -> new RuntimeException("Conta de cliente não encontrado"));
		return c;
		
	}

}
