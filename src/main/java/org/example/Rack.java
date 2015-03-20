package org.example;

import java.util.List;

public class Rack {

    private final Sorter<Integer> sorter;

    public Rack() {
        sorter = new Sorter<>();
    }

    public void add(int newBall) {
        sorter.add(newBall);
    }

    public List<Integer> getBalls() {
        return sorter.get();
    }
}
