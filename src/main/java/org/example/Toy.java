package org.example;

import java.util.*;

class Toy {
    String toyID, name;
    int frequency;

    Toy(String toyID, String name, int frequency) {
        this.toyID = toyID;
        this.name = name;
        this.frequency = frequency;
    }

    public static class ToyComparator implements Comparator<Toy> {
        public int compare(Toy t1, Toy t2) {
            return t2.frequency - t1.frequency;
        }
    }
}