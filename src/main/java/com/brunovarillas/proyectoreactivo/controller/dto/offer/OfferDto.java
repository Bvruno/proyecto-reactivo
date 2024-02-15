package com.brunovarillas.proyectoreactivo.controller.dto.offer;

import com.brunovarillas.proyectoreactivo.repository.enums.StateOffer;

public record OfferDto(Integer offerId, Integer productId, Integer stock, Double price, StateOffer status, Long date ) {
}
