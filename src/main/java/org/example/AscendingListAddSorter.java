package org.example;


public class AscendingListAddSorter<T extends Comparable> extends ListAddSorter<T> {

    @Override
    public boolean isOrdered(T existingValue, T newValue) {
        return existingValue.compareTo(newValue) > 0;
    }
}
