package com.project.textanalyzer;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Analytic {
    private Length length;
    private long wordCount;
    private List<CharacterAnalytic> characters;

    public Analytic(String text) {
        this.length = new Length(text);
        this.wordCount = text.split("\\w+").length;
        this.characters = countCharacters(text);
    }

    public List<CharacterAnalytic> countCharacters(String text) {
        ArrayList<CharacterAnalytic> characterCount = new ArrayList<>();
        char[] characters = text.toLowerCase().toCharArray();
        for(char character : characters) {
            if(Character.toString(character).matches("[a-z?]")) {
                CharacterAnalytic characterToAdd = new CharacterAnalytic(character,0);
                characterToAdd.addCharacter();
                characterCount.add(characterToAdd);
            }
        }

        return characterCount;
    }

    @Override
    public String toString() {
        return "Analytic{" +
                "length=" + length +
                ", wordCount=" + wordCount +
                ", characters=" + characters +
                '}';
    }
}
