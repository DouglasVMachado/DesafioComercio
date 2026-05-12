package dev.comercio.desafiocomercio.mapper;

import dev.comercio.desafiocomercio.controller.request.OrderRequest;
import dev.comercio.desafiocomercio.controller.response.OrderResponse;
import dev.comercio.desafiocomercio.model.Order;
import lombok.experimental.UtilityClass;

@UtilityClass
public class OrderMapper {

    public Order toOrder(OrderRequest orderRequest){
        return Order.builder()
                .products(orderRequest.products())
                .totalPrice(orderRequest.totalPrice())
                .build();
    }

    public OrderResponse toOrderResponse(Order order){
        return OrderResponse.builder()
                .id(order.getId())
                .date(order.getDate())
                .products(order.getProducts())
                .totalPrice(order.getTotalPrice())
                .build();
    }

}
