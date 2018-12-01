package com.project.textanalyzer;

public class CharacterAnalytic {
    private char character;
    private int charSum;

    public CharacterAnalytic(char character, int charSum) {
        this.character = character;
        this.charSum = charSum;
    }

    public void addCharacter() {
        this.charSum++;
    }

    @Override
    public String toString() {
        return "CharacterAnalytic{" +
                "character=" + character +
                ", charSum=" + charSum +
                '}';
    }
}
