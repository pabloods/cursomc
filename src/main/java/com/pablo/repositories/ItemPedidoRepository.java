package com.pablo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pablo.domain.ItemPedido;

	@Repository
	public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{
		
	}
	

