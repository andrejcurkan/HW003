package org.example;

import org.example.pharmacy.Medicine;
import org.example.pharmacy.Medicine2;
import org.example.pharmacy.MedicineComponent;
import org.example.pharmacy.impl.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



    public static void main(String[] args) {
        ArrayList<MedicineComponent> medList = new ArrayList<>();
        Asitromin asitr = new Asitromin("Asitro", 50, 25);
        Penicilinium penicilinium = new Penicilinium("Penicil", 30, 50);
        Vetbicid vetbic = new Vetbicid("Vetbic", 40, 30);
        Nozivin noz = new Nozivin("Noziv", 410, 13);
        Panadol pan = new Panadol("Pan", 111, 81);

        medList.add(asitr);
        medList.add(penicilinium);
        medList.add(vetbic);
        medList.add(noz);
        medList.add(pan);

        Medicine2 medicine1 = new Medicine2();
        Medicine medicine = new Medicine();

        // Добавляем MedicineComponent в Medicine
        for (MedicineComponent component : medList) {
            medicine.addComponent(component);
        }


        printSortedMedicine(medicine);
    }

    public static void printSortedMedicine(Medicine medicine) {

        List<Medicine> medicineList = new ArrayList<>();
        medicineList.add(medicine);





        for (Medicine med : medicineList) {
            System.out.println(med);
        }
    }

