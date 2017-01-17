package com.kotovdv.state;

import com.kotovdv.state.cd.CD;
import com.kotovdv.state.player.regular.RegularCdPlayer;

import static com.kotovdv.state.cd.PopularCD.SCORPIONS_GREATEST_HITS;

/**
 * @author Dmitriy Kotov
 */
public class App {

    public static void main(String[] args) {
        RegularCdPlayer player = new RegularCdPlayer();
        player.insertCd(SCORPIONS_GREATEST_HITS.getCd());

        player.startPlaying();
        player.stopPlaying();

        CD cd = player.extractCd();
        System.out.printf("Got back my CD [%s]%n", cd);
    }
}