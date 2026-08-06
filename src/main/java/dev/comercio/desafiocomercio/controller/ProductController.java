package dev.comercio.desafiocomercio.controller;


import dev.comercio.desafiocomercio.controller.request.ProductRequest;
import dev.comercio.desafiocomercio.controller.response.ProductResponse;
import dev.comercio.desafiocomercio.entity.Product;
import dev.comercio.desafiocomercio.mapper.ProductMapper;
import dev.comercio.desafiocomercio.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest){
        Product newProduct = ProductMapper.toProduct(productRequest);
        Product savedProduct = productService.createProduct(newProduct);
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<List<ProductResponse>> findAll(){
        List<ProductResponse> products = productService.findAll()
                .stream()
                .map(ProductMapper::toProductResponse)
                .toList();
        return ResponseEntity.ok().body(products);
    }

}
