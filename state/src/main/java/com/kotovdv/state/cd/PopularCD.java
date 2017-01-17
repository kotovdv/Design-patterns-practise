package com.kotovdv.state.cd;

/**
 * @author Dmitriy Kotov
 */
public enum PopularCD {
    SCORPIONS_GREATEST_HITS(new CD("Scorpions", "Greatest hits"));

    private final CD cd;

    PopularCD(CD cd) {
        this.cd = cd;
    }

    public CD getCd() {
        return cd;
    }
}