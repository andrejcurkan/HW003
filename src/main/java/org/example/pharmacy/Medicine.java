package org.example.pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Medicine implements Comparable {
    private List<MedicineComponent> components;

    public Medicine() {
        this.components = new ArrayList<>();
    }

    public Medicine addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }

    @Override
    public int compareTo(Medicine other) {

        return Integer.compare(this.components.size(), other.components.size());
    }

    @Override
    public int compareTo(MedicineComponent o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Medicine: " + components.toString();
    }
    
    @Override
    public int compareTo(Medicine o) {
        return this.components.size() - o.components.size();
    }

}
