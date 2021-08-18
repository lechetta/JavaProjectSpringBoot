package com.project.WebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.WebService.entities.Order;

//opcional -> "extends JpaRepository" ja registrou a classe como um componente repository do Spring
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
