package dev.comercio.desafiocomercio.controller.request;

import dev.comercio.desafiocomercio.model.Order;
import dev.comercio.desafiocomercio.model.Product;

import java.util.List;

public record OrderRequest(List<Product> products,
                           double totalPrice) {
}
