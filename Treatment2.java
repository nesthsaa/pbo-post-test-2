/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Treatmentt;

/**
 *
 * @author Asus Gk
 */
import java.util.Scanner;

public final class Treatment2 {
    private final String id;
    private String name;
    private double price;

    public Treatment2(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters (tanpa setter untuk atribut yang diinginkan sebagai final)
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void inputData(Scanner scanner) {
        scanner.nextLine();  
        System.out.print("Masukkan nama treatment: ");
        this.name = scanner.nextLine();
        System.out.print("Masukkan harga treatment: ");
        this.price = scanner.nextDouble();
        scanner.nextLine();  
    }

    @Override
    public String toString() {
        return " ID: " + id + "  Treatment: " + name + "  price: Rp " + price;
    }
}
  
