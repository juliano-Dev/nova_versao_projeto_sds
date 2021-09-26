package com.projetosds.dsvendas.dto;

import java.io.Serializable;

import com.projetosds.dsvendas.entities.Seller;

public class SellerDTO implements Serializable {

	private static final long serialVersionUID = 5762545264668889605L;
	private Long id;
	private String name;
	
	public SellerDTO() {}

	public SellerDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public SellerDTO(Seller entity) {
		id = entity.getId();
		name = entity.getName();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	





}
