package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextBox {

    private final List<Character> characters;
    private final ListAddSorter<Character> sorter;

    public TextBox(String text) {
        characters = new ArrayList<>(text.length());
        sorter = new AscendingListAddSorter<>();
        text.toLowerCase().replaceAll("[^a-z]", "").chars().forEach(this::add);

    }

    private void add(int charNumber) {
        sorter.addSorted(characters, (char) charNumber);
    }

    public String getSortedTextCharacters() {
        return characters.stream().map(String::valueOf).collect(Collectors.joining(""));
    }
}
