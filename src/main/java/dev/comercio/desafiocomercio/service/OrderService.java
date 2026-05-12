package dev.comercio.desafiocomercio.service;

import dev.comercio.desafiocomercio.model.Order;
import dev.comercio.desafiocomercio.repository.OrderRepository;
import dev.comercio.desafiocomercio.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }
}
