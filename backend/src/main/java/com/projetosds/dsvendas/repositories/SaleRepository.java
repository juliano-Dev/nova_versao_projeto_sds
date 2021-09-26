package com.projetosds.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projetosds.dsvendas.dto.SaleSuccessDTO;
import com.projetosds.dsvendas.dto.SaleSumDTO;
import com.projetosds.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("select new com.projetosds.dsvendas.dto.SaleSumDTO(obj.seller, sum(obj.amount)) "
			+ "from Sale as obj "
			+ "group by obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();

	@Query("select new com.projetosds.dsvendas.dto.SaleSuccessDTO(obj.seller, sum(obj.visited), sum (obj.deals)) "
			+ "from Sale as obj "
			+ "group by obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();

}
