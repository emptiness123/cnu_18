package com.cnu.blackjack;

import com.cnu.blackjack.exceptions.NotEnoughBalanceException;
import lombok.Data;

@Data
public class Player {

    private int balance;
    private int currentBet;
    private Hand hand;

    public Player(int seedMoney, Hand hand) {
        this.balance = seedMoney;
        this.hand = hand;
    }

    public void placeBet(int bet) {
        if(balance < bet) {
            throw new NotEnoughBalanceException();
        }
        balance -= bet;//배팅 금액을 삭제하고
        currentBet = bet;//배팅 금액을 현재 배팅 금액으로 설정
    }

    public Card hitCard() {
        return hand.drawCard();
    }
}
