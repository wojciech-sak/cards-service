package com.kodilla.cards.dto;

import com.kodilla.cards.domain.CardType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardDto {
    private Long id;
    private BigDecimal cardNum;
    private CardType cardType;
    private Long customerId;
}