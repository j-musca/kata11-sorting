package org.example;

import java.util.List;

public class AddSorter<T extends Comparable> {

    public AddSorter() {
    }

    public void addSorted(List<T> existingList, T newValue) {
        if (existingList.isEmpty()) {
            existingList.add(newValue);
        } else {
            for (int i = 0; i < existingList.size(); i++) {
                T existingBall = existingList.get(i);

                if (newValue.compareTo(existingBall) < 0) {
                    existingList.add(i, newValue);
                    break;
                } else if (i == existingList.size() - 1) {
                    existingList.add(newValue);
                    break;
                }
            }
        }
    }
}
