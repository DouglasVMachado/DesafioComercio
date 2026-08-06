package dev.comercio.desafiocomercio.repository;

import dev.comercio.desafiocomercio.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
