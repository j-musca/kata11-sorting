package org.example;

import java.util.stream.Collectors;

public class TextBox {

    private final String sortedText;

    public TextBox(String text) {
        final Sorter<Character> sorter = new Sorter<>();
        text.toLowerCase().replaceAll("[^a-z]", "").chars().forEach( value -> sorter.add( (char) value ));
        sortedText = sorter.get().stream().map(String::valueOf).collect(Collectors.joining(""));
    }

    public String getSortedTextCharacters() {
        return sortedText;
    }
}
