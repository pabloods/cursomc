package com.pablo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pablo.domain.Cidade;

	@Repository
	public interface CidadeRepository extends JpaRepository<Cidade, Integer>{ 
		
	}
	

