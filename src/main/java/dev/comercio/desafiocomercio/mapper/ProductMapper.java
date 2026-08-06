package dev.comercio.desafiocomercio.mapper;

import dev.comercio.desafiocomercio.controller.request.ProductRequest;
import dev.comercio.desafiocomercio.controller.response.ProductResponse;
import dev.comercio.desafiocomercio.entity.Product;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest){
        return Product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .stock(productRequest.stock())
                .build();
    }

    public ProductResponse toProductResponse(Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .stock(product.getStock())
                .build();
    }

}
