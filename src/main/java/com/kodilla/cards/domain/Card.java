package com.kodilla.cards.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "CARDS")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CARD_ID", unique = true)
    private Long id;

    private BigDecimal cardNum;

    @Enumerated(EnumType.STRING)
    private CardType cardType;

    private Long customerId;

    public Card(BigDecimal cardNum, CardType cardType, Long customerId) {
        this.cardNum = cardNum;
        this.cardType = cardType;
        this.customerId = customerId;
    }
}


