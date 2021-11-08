package com.kodilla.cards.controller;

import com.kodilla.cards.controller.response.GetCardsResponse;
import com.kodilla.cards.mapper.CardsMapper;
import com.kodilla.cards.service.CardsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/cards")
public class CardsController {

    private final CardsService cardsService;
    private final CardsMapper cardsMapper;

    @Autowired
    public CardsController(CardsService cardsService, CardsMapper cardsMapper) {
        this.cardsService = cardsService;
        this.cardsMapper = cardsMapper;
    }

    @GetMapping
    public GetCardsResponse getCustomerCards(@RequestParam Long customerId) {
        log.info("Get cards for customerId: {}", customerId);
        return GetCardsResponse.of(
                cardsMapper.mapToCardDtoList(cardsService.getCustomerCards(customerId)));
    }


}
