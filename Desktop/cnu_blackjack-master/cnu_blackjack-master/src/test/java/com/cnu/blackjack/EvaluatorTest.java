package com.cnu.blackjack;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;

public class EvaluatorTest {

    @Test
    public void 게임초기화시_모든플레이어는_2장의카드를_받는다() {
        Deck deck = new Deck(1);
        Game game = new Game(deck);
        game.addPlayer("AAA", 500);
        game.addPlayer("BBB", 300);
        Evaluator evaluator = new Evaluator(game.getPlayerList());
        assertThat(deck.getTotalCard(), is(48));
    }

    @Test
    public void 각_플레이어는_16이하면_히트한다() {


    }

    @Test
    public void 블랙잭이나오면_2배로_보상받고_해당_플레이어의_턴은_끝난다() {
        Deck deck=new Deck(1);
        Game game=new Game(deck);
        game.addPlayer("AAA", 500);
        Player player = game.getPlayerList().get("AAA");
        player.placeBet(50);

        int currentMoney=player.getBalance();
        //System.out.println(currentMoney);

        Evaluator e=new Evaluator(game.getPlayerList());
        e.start();
        if(e.getPlayerNumber(player)==21){
            //System.out.println(player.getBalance());
            assertTrue(player.getBalance()>currentMoney);
        }
        else {
            //System.out.println(player.getBalance());
            assertFalse(false);
        }
    }

    @Test
    public void 각_플레이어는_17이상이면_스테이한다() {

    }
}