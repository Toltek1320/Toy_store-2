package org.example;

import java.util.*;

public class ToyManager {
    ArrayList<String> ids = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> freqs = new ArrayList<>();
    PriorityQueue<Toy> queue = new PriorityQueue<>(3, new Toy.ToyComparator());

    void put(String id, String name, int frequency) {
        ids.add(id);
        names.add(name);
        freqs.add(frequency);
        queue.add(new Toy(id, name, frequency));
    }

    String get() {
        Toy toy = queue.poll();
        assert toy != null;
        String toyID = toy.toyID;

        if (toy.frequency != 1) {
            toy.frequency--;
            queue.add(toy);
        }
        return toyID;
    }
}