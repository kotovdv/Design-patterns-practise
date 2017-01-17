package com.kotovdv.state.player.regular;

import com.kotovdv.state.cd.CD;
import com.kotovdv.state.exception.IllegalCdPlayerStateException;

import static com.kotovdv.state.cd.NullCd.NULL_CD;

/**
 * @author Dmitriy Kotov
 */
class InsertedCdState extends RegularCdPlayerState {

    InsertedCdState(RegularCdPlayer cdPlayer) {
        super(cdPlayer);
    }

    @Override
    public void startPlaying() {
        CD cd = cdPlayer.getCd();
        System.out.println("Starting to play CD [" + cd + "]");

        cdPlayer.changeStateTo(new PlayingCdState(cdPlayer));
    }

    @Override
    public void stopPlaying() {
        throw new IllegalCdPlayerStateException("You have not yet started CD player, start it before you stop it");
    }

    @Override
    public void insertCd(CD cd) {
        throw new IllegalCdPlayerStateException("CD is already inserted, please remove current CD before you insert new one");
    }

    @Override
    public CD extractCd() {
        CD cd = cdPlayer.getCd();
        System.out.printf("Extracting CD [%s]%n", cd);
        cdPlayer.setCd(NULL_CD);
        cdPlayer.changeStateTo(new NoCdState(cdPlayer));

        return cd;
    }
}