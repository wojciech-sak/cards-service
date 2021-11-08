package com.kodilla.cards.service;

import com.kodilla.cards.domain.Card;

import java.util.List;

public interface CardsService {
    List<Card> getCustomerCards(Long customerId);
}
