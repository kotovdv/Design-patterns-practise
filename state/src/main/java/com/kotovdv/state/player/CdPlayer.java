package com.kotovdv.state.player;

import com.kotovdv.state.cd.CD;

/**
 * @author Dmitriy Kotov
 */
public interface CdPlayer {

    /**
     * Turns the music on
     *
     * @throws com.kotovdv.state.exception.IllegalCdPlayerStateException if it the player is unable to perform requested action
     */
    void startPlaying();

    /**
     * Turns the music off
     *
     * @throws com.kotovdv.state.exception.IllegalCdPlayerStateException if it the player is unable to perform requested action
     */
    void stopPlaying();

    /**
     * Inserts CD
     *
     * @param cd cd, that you want to insert
     * @throws com.kotovdv.state.exception.IllegalCdPlayerStateException if it the player is unable to perform requested action
     */
    void insertCd(CD cd);

    /**
     * Removes CD from CdPlayer
     *
     * @return CD, that was inside
     * @throws com.kotovdv.state.exception.IllegalCdPlayerStateException if it the player is unable to perform requested action
     */
    CD extractCd();
}