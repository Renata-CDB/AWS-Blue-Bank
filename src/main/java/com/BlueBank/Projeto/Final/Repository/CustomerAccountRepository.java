package com.BlueBank.Projeto.Final.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BlueBank.Projeto.Final.Model.CustomerAccount;

@Repository
public interface CustomerAccountRepository extends JpaRepository<CustomerAccount, Long>
{

}
