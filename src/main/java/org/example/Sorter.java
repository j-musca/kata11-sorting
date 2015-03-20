package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/**
 * This sorter works in two phases.
 *
 * In the first phase all values are kept in a map with each value as a key to the list of values. see #add(T value)
 *
 * In the second phase the keys are sorted and the corresponding lists are merged into one sorted list. see #get()
 */
public class Sorter<T extends Comparable> {

    private final Map<T, List<T>> map;

    public Sorter() {
        this.map = new HashMap<>();
    }

    public void add(T value) {
        if (!map.containsKey(value)) {
            map.put(value, new ArrayList<>());
        }

        map.get(value).add(value);
    }

    public List<T> get() {
        List<T> sortedKey = getSortedKeys(map.keySet());
        List<T> result = new ArrayList<>();

        sortedKey.stream().map(map::get).forEach(result::addAll);

        return result;
    }

    private List<T> getSortedKeys(Set<T> keys) {
        List<T> sortedKeys = new ArrayList<>(keys.size());

        for (T key : keys) {
            addSorted(sortedKeys, key);
        }

        return sortedKeys;
    }

    private void addSorted(List<T> existingList, T newValue) {
        ListIterator<T> iterator = existingList.listIterator();

        while (iterator.hasNext()) {
            T existingValue = iterator.next();

            if (existingValue.compareTo(newValue) > 0) {
                iterator.previous();
                break;
            }
        }

        iterator.add(newValue);
    }
}
