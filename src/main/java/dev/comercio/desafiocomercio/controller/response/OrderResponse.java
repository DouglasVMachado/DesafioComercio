package dev.comercio.desafiocomercio.controller.response;

import dev.comercio.desafiocomercio.model.Product;
import lombok.Builder;

import java.util.Date;
import java.util.List;

@Builder
public record OrderResponse(Long id,
                            Date date,
                            List<Product> products,
                            double totalPrice) {
}
