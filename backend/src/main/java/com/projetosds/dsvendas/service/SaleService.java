package com.projetosds.dsvendas.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.projetosds.dsvendas.dto.SaleDTO;
import com.projetosds.dsvendas.entities.Sale;
import com.projetosds.dsvendas.repositories.SaleRepository;
import com.projetosds.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	//dependencia para optimizar consulta banco
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional()
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
		
	}
	
}
/*
 public List<SaleDTO> findAll(){		
		List<Sale> result = repository.findAll();
		return result.stream().map(x -> new SaleDTO(x)).collect(Collectors.toList());
		
	} 
 
 */
