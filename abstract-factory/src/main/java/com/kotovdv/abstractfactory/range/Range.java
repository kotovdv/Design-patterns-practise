package com.kotovdv.abstractfactory.range;

/**
 * @author Dmitriy Kotov
 */
public abstract class Range<T> {

    private final T from;
    private final T to;

    public Range(T from, T to) {
        this.from = from;
        this.to = to;
    }

    public T from() {
        return from;
    }

    public T to() {
        return to;
    }
}
