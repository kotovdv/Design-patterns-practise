package com.kotovdv.state.cd;

/**
 * @author Dmitriy Kotov
 */
public class CD {

    private final String author;
    private final String name;

    CD(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CD{" +
                "author='" + getAuthor() + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }
}