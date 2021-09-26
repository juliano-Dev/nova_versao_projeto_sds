package com.projetosds.dsvendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetosds.dsvendas.dto.SaleDTO;
import com.projetosds.dsvendas.service.SaleService;

@RestController
@RequestMapping(value="/sales")
public class SaleControler {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageble){
		Page<SaleDTO> list = service.findAll(pageble);
		return ResponseEntity.ok(list);
	}
	
	
}
