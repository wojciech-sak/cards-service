package com.kodilla.cards.mapper;

import com.kodilla.cards.dao.CardsDao;
import com.kodilla.cards.domain.Card;
import com.kodilla.cards.dto.CardDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CardsMapper {
    public List<CardDto> mapToCardDtoList(List<Card> cards) {
        return cards.stream()
                .map(this::mapToCardDto)
                .collect(Collectors.toList());
    }

    public CardDto mapToCardDto(Card card) {
        return CardDto.builder()
                .id(card.getId())
                .cardNum(card.getCardNum())
                .cardType(card.getCardType())
                .customerId(card.getCustomerId())
                .build();
    }
}
