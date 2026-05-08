package dev.comercio.desafiocomercio.controller.request;

public record ProductRequest(String name,
                             String description,
                             double price,
                             int quantity) {
}
