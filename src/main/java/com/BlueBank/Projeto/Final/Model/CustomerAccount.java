package com.BlueBank.Projeto.Final.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TB_CUSTOMER_ACCOUNT")
public class CustomerAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nameOwner", length = 50, unique = true)
	private String nameOwner;

	@Column(name = "agencyCode", length = 4)
	private String agencyCode;

	@Column(name = "numberAccount", length = 8)
	private String numberAccount;

	@Column(name = "digitVerification", length = 3)
	private String digitVerification;

	@Column(name = "registerId", length = 20)
	private String registerId;

	public CustomerAccount()

	{

	}

	public Long getId() {
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerAccount other = (CustomerAccount) obj;
		return Objects.equals(id, other.id);
	}

}

    

          


