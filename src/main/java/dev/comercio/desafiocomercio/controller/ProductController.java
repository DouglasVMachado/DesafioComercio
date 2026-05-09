package dev.comercio.desafiocomercio.controller;

import dev.comercio.desafiocomercio.controller.request.ProductRequest;
import dev.comercio.desafiocomercio.controller.response.ProductResponse;
import dev.comercio.desafiocomercio.mapper.ProductMapper;
import dev.comercio.desafiocomercio.model.Product;
import dev.comercio.desafiocomercio.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest productRequest){
        Product newProduct = ProductMapper.toProduct(productRequest);
        Product savedProduct = productService.create(newProduct);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }



}
