package org.example;

import org.example.pharmacy.Medicine;
import org.example.pharmacy.Medicine2;
import org.example.pharmacy.MedicineComponent;
import org.example.pharmacy.impl.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        // Создаем несколько экземпляров Medicine
        Medicine medicine1 = new Medicine().addComponent(new MedicineComponent("Component A", 55, 85))
                .addComponent(new MedicineComponent("Component B", 77, 15));
        Medicine medicine2 = new Medicine().addComponent(new MedicineComponent("Component C", 10, 66))
                .addComponent(new MedicineComponent("Component D", 8, 23))
                .addComponent(new MedicineComponent("Component E", 7, 50));
        Medicine medicine3 = new Medicine().addComponent(new MedicineComponent("Component F", 8, 99));


        ArrayList<Medicine> medicines = new ArrayList<>();
        medicines.add(medicine1);
        medicines.add(medicine2);
        medicines.add(medicine3);


        printSortedMedicine(medicines);
    }

    public static void printSortedMedicine(ArrayList<Medicine> medicines) {

        Collections.sort(medicines);


        for (Medicine medicine : medicines) {
            System.out.println(medicine);
        }
    }
}



  
