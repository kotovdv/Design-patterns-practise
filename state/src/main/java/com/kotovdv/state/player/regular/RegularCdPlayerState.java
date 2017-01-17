package com.kotovdv.state.player.regular;

import com.kotovdv.state.player.CdPlayer;

/**
 * @author Dmitriy Kotov
 */
abstract class RegularCdPlayerState implements CdPlayer {

    protected RegularCdPlayer cdPlayer;

    RegularCdPlayerState(RegularCdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }
}