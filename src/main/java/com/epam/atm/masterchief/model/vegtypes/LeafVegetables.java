package com.epam.atm.masterchief.model.vegtypes;

import com.epam.atm.masterchief.model.Vegetable;

import java.util.ArrayList;

public class LeafVegetables extends Vegetable {

    public LeafVegetables(String name, int weight, double calories, double carbohydrate, double fiber, double sugar, double protein, double fat) {
        super(name, weight, calories, carbohydrate, fiber, sugar, protein, fat);
    }

    public LeafVegetables(String name, int weight, int calories) {
        super(name, weight, calories);
    }

    private ArrayList<Vegetable> leafVegetables = new ArrayList<>();

    Vegetable spinach = new LeafVegetables("spinach", 23, 100);
    Vegetable lettuce = new LeafVegetables("lettuce", 100, 151, 2.8, 1.3, 0.8, 1.4, 0.2);
    Vegetable cabbage = new LeafVegetables("cabbage", 100, 25, 5.8, 2.5, 3.2, 1.3, 0.1);


}
