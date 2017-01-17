package com.kotovdv.state.player.regular;

import com.kotovdv.state.cd.CD;
import com.kotovdv.state.exception.IllegalCdPlayerStateException;

import static java.lang.String.format;

/**
 * @author Dmitriy Kotov
 */
class PlayingCdState extends RegularCdPlayerState {

    PlayingCdState(RegularCdPlayer cdPlayer) {
        super(cdPlayer);
    }

    @Override
    public void startPlaying() {
        throw new IllegalCdPlayerStateException(format("Player is already playing CD [%s]", cdPlayer.getCd()));
    }

    @Override
    public void stopPlaying() {
        System.out.printf("Stopping to play CD [%s]%n", cdPlayer.getCd());
        cdPlayer.changeStateTo(new InsertedCdState(cdPlayer));
    }

    @Override
    public void insertCd(CD cd) {
        throw new IllegalCdPlayerStateException(String.format("Cant insert CD while playing CD [%s]", cdPlayer.getCd()));
    }

    @Override
    public CD extractCd() {
        throw new IllegalCdPlayerStateException(format("You need to stop playing CD [%s] in order to extract it%n", cdPlayer.getCd()));
    }
}