package com.kotovdv.state.cd;

import com.kotovdv.state.exception.AccessingNullObjectException;

/**
 * @author Dmitriy Kotov
 */
public class NullCd extends CD {

    public final static NullCd NULL_CD = new NullCd();

    private NullCd() {
        super(null, null);
    }

    @Override
    public String getAuthor() {
        throw new AccessingNullObjectException();
    }

    @Override
    public String getName() {
        throw new AccessingNullObjectException();
    }

    @Override
    public String toString() {
        throw new AccessingNullObjectException();
    }
}