package org.example.pharmacy;

public interface Comparable<M> {
    int compareTo(Medicine other);

    int compareTo(MedicineComponent o);
}

