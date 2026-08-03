package dev.comercio.desafiocomercio.repository;

import dev.comercio.desafiocomercio.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
