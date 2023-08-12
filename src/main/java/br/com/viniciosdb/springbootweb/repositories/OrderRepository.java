package br.com.viniciosdb.springbootweb.repositories;

import br.com.viniciosdb.springbootweb.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> { }
