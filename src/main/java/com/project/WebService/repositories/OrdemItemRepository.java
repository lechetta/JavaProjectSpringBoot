package com.project.WebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.WebService.entities.OrdemItem;

//opcional -> "extends JpaRepository" ja registrou a classe como um componente repository do Spring

@Repository
public interface OrdemItemRepository extends JpaRepository<OrdemItem, Long> {
	
	

}
