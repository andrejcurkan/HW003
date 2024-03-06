package org.example.pharmacy.impl;

import org.example.pharmacy.Medicine;
import org.example.pharmacy.MedicineComponent;

public class Panadol extends MedicineComponent {
    public Panadol(String name, float weight, int power) {
        super(name, weight);
    }

    @Override
    public int compareTo(Medicine other) {
        return 0;
    }
}
