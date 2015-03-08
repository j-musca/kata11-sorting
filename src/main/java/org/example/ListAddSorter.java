package org.example;

import java.util.List;

public abstract class ListAddSorter<T extends Comparable> {

    public ListAddSorter() {
    }

    public void addSorted(List<T> existingList, T newValue) {
        if (existingList.isEmpty()) {
            existingList.add(newValue);
        } else {
            for (int i = 0; i < existingList.size(); i++) {
                T existingValue = existingList.get(i);

                if (isOrdered(existingValue, newValue)) {
                    existingList.add(i, newValue);
                    break;
                } else if (i == existingList.size() - 1) {
                    existingList.add(newValue);
                    break;
                }
            }
        }
    }

    public abstract boolean isOrdered(T existingValue, T newValue);
}
