package com.kodilla.cards.service;

import com.kodilla.cards.dao.CardsDao;
import com.kodilla.cards.domain.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardsServiceImpl implements CardsService {

    private final CardsDao cardsDao;

    @Autowired
    public CardsServiceImpl(CardsDao cardsDao) {
        this.cardsDao = cardsDao;
    }

    @Override
    public List<Card> getCustomerCards(Long customerId) {
        return cardsDao.getCardByCustomerId(customerId);
    }
}
