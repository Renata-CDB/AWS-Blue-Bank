package com.BlueBank.Projeto.Final.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name= "Tb_Customer_Account")
public class CustomerAccount implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;
    private String nameOwner;
    private String agencyCode;
    private String numberAccount;
    private String digitVerification;
    private String registerId;

    public CustomerAccount()
    {


    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public String getDigitVerification() {
        return digitVerification;
    }

    public void setDigitVerification(String digitVerification) {
        this.digitVerification = digitVerification;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }


}

