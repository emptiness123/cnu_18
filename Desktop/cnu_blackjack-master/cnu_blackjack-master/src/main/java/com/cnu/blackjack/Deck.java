package com.cnu.blackjack;

import com.cnu.blackjack.exceptions.NoMoreCardException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final int number;
    private final List<Card> cardList;

    public Deck(int number) {//number만큼의 Deck들을 생성함
        this.number = number;
        this.cardList = new ArrayList<Card>();
        createCards(number);
        Collections.shuffle(cardList);//카드 섞어줌
    }

    private void createCards(int number) {//카드를 생성해줌->카드 한 통
        // create card for single deck
        for (int j = 0; j < number; j++) {
            for (Suit suit : Suit.values()) {
                for (int i = 1 ; i < 14; i++) {//11==J,12==Q,13==K
                    Card card = new Card(i, suit);
                    cardList.add(card);
                }
            }
        }
    }

    public int getTotalCard() {
        return cardList.size();
    }//전체 카드 개수를 리턴

    public Card drawCard() {
        if (cardList.size() == 0) {
            throw new NoMoreCardException();
        }
        return cardList.remove(0);//카드 리스트의 첫 번째 요소 제거함
    }
}
