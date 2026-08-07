package dev.comercio.desafiocomercio.service;

import dev.comercio.desafiocomercio.entity.Order;
import dev.comercio.desafiocomercio.repository.OrderRepository;
import jakarta.persistence.Entity;

import java.util.List;
import java.util.Optional;

@Entity
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Optional<Order> findById(Long id){
        return orderRepository.findById(id);
    }

}
