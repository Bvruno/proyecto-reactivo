package com.brunovarillas.proyectoreactivo.controller.dto.offer;

import com.brunovarillas.proyectoreactivo.repository.enums.StateOffer;

public record DeleteOfferDto(
        Integer offerId,
        StateOffer status,
        Long date
) {
}
