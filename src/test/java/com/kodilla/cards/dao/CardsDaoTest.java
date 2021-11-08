package com.kodilla.cards.dao;

import com.kodilla.cards.domain.Card;
import com.kodilla.cards.domain.CardType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@Transactional
class CardsDaoTest {

    @Autowired
    private CardsDao cardsDao;

    @Test
    void getCardByCustomerId() {
        //Given
        Card card1 = new Card(new BigDecimal("888999000"), CardType.CREDIT_CARD, 10L);
        Card card2 = new Card(new BigDecimal("333222111"), CardType.DEBIT_CARD, 10L);

        Card savedCard1 = cardsDao.save(card1);
        Card savedCard2 = cardsDao.save(card2);

        //When
        List<Card> retrievedCards = cardsDao.getCardByCustomerId(10L);

        //Then
        assertEquals(retrievedCards.size(), 2);
    }
}