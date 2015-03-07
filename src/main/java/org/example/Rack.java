package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rack {

    private final List<Integer> balls;
    private final AddSorter<Integer> sorter;

    public Rack() {
        balls = new ArrayList<>();
        sorter = new AddSorter<>();
    }

    public void add(int newBall) {
        sorter.addSorted(balls, newBall);
    }

    public List<Integer> getBalls() {
        return Collections.unmodifiableList(balls);
    }
}
