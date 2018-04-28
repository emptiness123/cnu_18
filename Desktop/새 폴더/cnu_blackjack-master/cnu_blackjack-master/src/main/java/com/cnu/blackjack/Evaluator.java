package com.cnu.blackjack;

import java.util.Map;

public class Evaluator {

    private Map<String, Player> playerMap;//player여러명 가능하게
    private Dealer dealer;

    public Evaluator(Map<String, Player> playerMap) {
        this.playerMap = playerMap;
        dealer = new Dealer();
        dealCardToPlayers();
    }

    public void start() {
        int dealerNumber = getDealerNumber();
        playerMap.forEach((name, player) -> {
            checkCard(player);
            int playerNumber = getPlayerNumber(player);
            if(playerNumber == 21) {
                player.setBalance(player.getBalance() + player.getCurrentBet() * 3);
                System.out.println("Blackjack~~~");
            }
            else if(playerNumber > 21 || playerNumber == dealerNumber || playerNumber < dealerNumber) {
                System.out.println("Boom! or same same or lose");
            }
            else if(playerNumber > dealerNumber) {
                player.setBalance(player.getBalance() + player.getCurrentBet() * 2);
                System.out.println("You win");
            }
        });
    }

    private void dealCardToPlayers() {
        playerMap.forEach((name, player) -> {//player가 처음에 두장을 뽑음
            player.hitCard();
            player.hitCard();
        });
    }
}
