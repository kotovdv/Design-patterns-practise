package com.kotovdv.state.player.regular;

import com.kotovdv.state.cd.CD;
import com.kotovdv.state.player.CdPlayer;

/**
 * @author Dmitriy Kotov
 */
public class RegularCdPlayer implements CdPlayer {

    private RegularCdPlayerState currentState;
    private CD currentCd;

    public RegularCdPlayer() {
        this.currentState = new NoCdState(this);
    }

    public void startPlaying() {
        System.out.println("Attempting to start playing");
        currentState.startPlaying();
    }

    @Override
    public void stopPlaying() {
        System.out.println("Attempting to stop playing");
        currentState.stopPlaying();
    }

    @Override
    public void insertCd(CD cd) {
        System.out.println("Attempting to insert CD");
        currentState.insertCd(cd);
    }

    @Override
    public CD extractCd() {
        System.out.println("Attempting to remove CD");
        return currentState.extractCd();
    }

    void changeStateTo(RegularCdPlayerState newState) {
        this.currentState = newState;
    }

    CD getCd() {
        return currentCd;
    }

    void setCd(CD newCd) {
        this.currentCd = newCd;
    }
}