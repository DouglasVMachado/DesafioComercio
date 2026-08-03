package dev.comercio.desafiocomercio.service;

import dev.comercio.desafiocomercio.entity.Product;
import dev.comercio.desafiocomercio.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }


}
