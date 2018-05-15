package com.cnu.blackjack;

import java.util.concurrent.ThreadLocalRandom;

public class Dealer {

    public int getDealerScore() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int score = random.nextInt(17, 25);//랜덤한 수를 주어서 플레이함
        System.out.println(score);
        return score;
    }
}
