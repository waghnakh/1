package com.marketmaking;

import java.util.ArrayList;
import java.util.List;


public class MarketMakingGameCode {
    static List<AI> players;
    public static void main(String[] args) {

        players.get(0).observe(0, 12);
//        System.out.println(players.get(0).guessCardValue(1,53));
        System.out.println(players.get(0).myMarketValueMu);
        System.out.println(players.get(0).myMarketValueSigma);
    }
        public void revealCard(int cardIndex, int value){
        players.get(0).observe(cardIndex, value);
        players.get(1).observe(cardIndex, value);
        players.get(2).observe(cardIndex, value);
    }

}
