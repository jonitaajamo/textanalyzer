package com.project.textanalyzer;

public class Length {

    private int withSpaces;
    private int withoutSpaces;

    public Length(String text) {
        this.withSpaces = text.length();
        this.withoutSpaces = text.replace(" ", "").length();
    }

    @Override
    public String toString() {
        return "Length{" +
                "withSpaces=" + withSpaces +
                ", withoutSpaces=" + withoutSpaces +
                '}';
    }
}
