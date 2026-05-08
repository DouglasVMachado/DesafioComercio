package dev.comercio.desafiocomercio.controller.response;

import lombok.Builder;

@Builder
public record ProductResponse(Long id,
                              String name,
                              String description,
                              double price,
                              int quantity) {
}
