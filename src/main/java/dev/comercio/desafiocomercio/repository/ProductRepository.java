package dev.comercio.desafiocomercio.repository;

import dev.comercio.desafiocomercio.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
