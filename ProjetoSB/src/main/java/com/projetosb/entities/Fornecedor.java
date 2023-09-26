package com.projetosb.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "fornecedor")
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	@Column(name = "razaoSocial")
	private String socialReason;
	
	@Column(name = "nomeFantasia")
	private String fantasyName;
	
	@Column(name = "cnpj")
	private String cnpj;
	
	@Column(name = "endereco")
	private String adress;
	
	@Column(name = "fone")
	private String phone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "inscricaoEstadual")
	private String stateRegistration;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSocialReason() {
		return socialReason;
	}
	public void setSocialReason(String socialReason) {
		this.socialReason = socialReason;
	}
	public String getFantasyName() {
		return fantasyName;
	}
	public void setFantasyName(String fantasyName) {
		this.fantasyName = fantasyName;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStateRegistration() {
		return stateRegistration;
	}
	public void setStateRegistration(String stateRegistration) {
		this.stateRegistration = stateRegistration;
	}


}