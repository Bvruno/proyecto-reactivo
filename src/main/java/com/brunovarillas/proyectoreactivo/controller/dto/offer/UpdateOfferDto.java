package com.brunovarillas.proyectoreactivo.controller.dto.offer;

import com.brunovarillas.proyectoreactivo.repository.enums.StateOffer;

public record UpdateOfferDto(
        Integer offerId,
        Integer stock,
        Double price,
        StateOffer status,
        Long date
) {
}
