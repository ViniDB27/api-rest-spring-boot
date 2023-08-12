package br.com.viniciosdb.springbootweb.services;

import br.com.viniciosdb.springbootweb.entities.Order;
import br.com.viniciosdb.springbootweb.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> order = repository.findById(id);
        return order.get();
    }
}