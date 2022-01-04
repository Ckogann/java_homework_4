package ckogann;

public class Smartphone {
    String model;
    String date;
    boolean isItTop;
    double size;
    int memory;

    public void smartphoneSpecs() {
        System.out.println("Model: " + model);
        System.out.println("Date: " + date);
        System.out.println("Top Smartphone: " + isItTop);
        System.out.println("Display (inches): " + size);
        System.out.println("Memory (GB): " + memory);
    }
}