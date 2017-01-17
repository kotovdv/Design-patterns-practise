package com.kotovdv.state.player.regular;

import com.kotovdv.state.cd.CD;
import com.kotovdv.state.exception.IllegalCdPlayerStateException;

/**
 * @author Dmitriy Kotov
 */
class NoCdState extends RegularCdPlayerState {

    NoCdState(RegularCdPlayer cdPlayer) {
        super(cdPlayer);
    }

    @Override
    public void startPlaying() {
        throw new IllegalCdPlayerStateException("No CD inserted, cant start");
    }

    @Override
    public void stopPlaying() {
        throw new IllegalCdPlayerStateException("No CD inserted, cant stop");
    }

    @Override
    public void insertCd(CD cd) {
        System.out.printf("Inserting CD [%s]%n", cd);
        cdPlayer.setCd(cd);
        cdPlayer.changeStateTo(new InsertedCdState(cdPlayer));
    }

    @Override
    public CD extractCd() {
        throw new IllegalCdPlayerStateException("No CD inserted, cant extract");
    }
}