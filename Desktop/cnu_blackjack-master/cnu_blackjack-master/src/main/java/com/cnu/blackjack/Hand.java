package com.cnu.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private Deck deck;
    private List<Card> cardList = new ArrayList<Card>();//내가 가진 카드 리스트

    public Hand(Deck deck) {
        this.deck = deck;
    }

    public Card drawCard() {
        Card card = deck.drawCard();//dack에서 카드 한 장을 뽑아
        cardList.add(card);//내 카드로 넣고
        return card;//받은 카드를 리턴
    }

    public List<Card> getCardList() {
        return cardList;
    }
}

   /* public int totalCardNum(){
    int sum=0;
        Itorator itorator = cardList.itorator();
        while(itorator.hasNext()){
               sum = itorator.next().rank + sum;
        }
        return sum;
    }*/