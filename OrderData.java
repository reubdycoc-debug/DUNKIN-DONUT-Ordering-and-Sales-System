/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
/**
 *
 * @author ava
 */
public class OrderData {
    public static ArrayList<String> products = new ArrayList<>();
    public static ArrayList<Integer> quantities = new ArrayList<>();
    public static ArrayList<Double> prices = new ArrayList<>();

    public static double total = 0;

    public static void addProduct(String name, int quantity, double price) {
        products.add(name);
        quantities.add(quantity);
        prices.add(price);
        total = total + (quantity * price);
    }
}
