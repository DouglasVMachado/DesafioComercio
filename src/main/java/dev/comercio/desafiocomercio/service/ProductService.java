package dev.comercio.desafiocomercio.service;

import dev.comercio.desafiocomercio.model.Product;
import dev.comercio.desafiocomercio.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product create(Product product){
        return productRepository.save(product);
    }
}
