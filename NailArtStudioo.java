/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nailartstudioo;

/**
 *
 * @author Asus Gk
 */
import Treatmentt.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class NailArtStudioo {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Treatment2> treatments = new ArrayList<>();

    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Treatment");
            System.out.println("2. Tampilkan Semua Treatment");
            System.out.println("3. Edit Treatment");
            System.out.println("4. Cari Treatment");
            System.out.println("5. Hapus Treatment");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    addTreatment();
                    break;
                case 2:
                    displayAllTreatments();
                    break;
                case 3:
                    editTreatment();
                    break;
                case 4:
                    searchTreatment();
                    break;
                case 5:
                    deleteTreatment();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    private static final void addTreatment() {
        scanner.nextLine(); 
        System.out.print("Masukkan ID treatment: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan nama treatment: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan harga treatment: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  

        Treatment2 treatment = new Treatment2(id, name, price);
        treatments.add(treatment);
        System.out.println("Treatment berhasil ditambahkan.");
    }

    private static final void displayAllTreatments() {
        System.out.println("Daftar Treatment:");
        for (int i = 0; i < treatments.size(); i++) {
            System.out.println((i + 1) + ". " + treatments.get(i));
        }
    }

    private static final void editTreatment() {
        displayAllTreatments();
        System.out.print("Pilih nomor treatment yang ingin diubah: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  

        if (choice >= 1 && choice <= treatments.size()) {
            Treatment2 treatment = treatments.get(choice - 1);
            treatment.inputData(scanner);
            System.out.println("Treatment berhasil diubah.");
        } else {
            System.out.println("Nomor treatment tidak valid.");
        }
    }

    private static final void deleteTreatment() {
        displayAllTreatments();
        System.out.print("Masukkan nama treatment yang ingin dihapus: ");
        String searchName = scanner.nextLine();

        Iterator<Treatment2> iterator = treatments.iterator();
        boolean treatmentFound = false;

        while (iterator.hasNext()) {
            Treatment2 treatment = iterator.next();
            if (treatment.getName().equalsIgnoreCase(searchName)) {
                iterator.remove();
                treatmentFound = true;
                System.out.println("Treatment berhasil dihapus.");
                break;  
            }
        }

        if (!treatmentFound) {
            System.out.println("Treatment dengan nama " + searchName + " tidak ditemukan.");
        }
    }

    private static final void searchTreatment() {
        scanner.nextLine();  
        System.out.print("Masukkan nama treatment untuk dicari: ");
        String searchName = scanner.nextLine();

        boolean found = false;
        for (Treatment2 treatment : treatments) {
            if (treatment.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Treatment ditemukan: " + treatment);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Treatment dengan nama " + searchName + " tidak ditemukan.");
        }
    }
}
