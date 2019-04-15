package com.epam.atm.masterchief.model.vegtypes;

import com.epam.atm.masterchief.model.Vegetable;

import java.util.ArrayList;

public class RootVegetables extends Vegetable {

    public RootVegetables(String name, int weight, int calories) {
        super(name, weight, calories);
    }

    public RootVegetables(String name, int weight, double calories, double carbohydrate, double fiber, double sugar, double protein, double fat) {
        super(name, weight, calories, carbohydrate, fiber, sugar, protein, fat);
    }

    private ArrayList<Vegetable> rootVegetables = new ArrayList<>();

    Vegetable potato = new RootVegetables("potato", 100, 77, 18.4, 2.2, 0.8, 2.0, 0.1);
    Vegetable carrot = new RootVegetables("carrot", 100, 41, 9.6, 2.8, 4.7, 0.9, 0.2);
    Vegetable radish = new RootVegetables("radish", 100, 16, 3.5, 1.6, 1.9, 0.7, 0.1);


    public ArrayList<Vegetable> getRootVegetables() {
        return rootVegetables;
    }

    public void setRootVegetables(ArrayList<Vegetable> rootVegetables) {
        this.rootVegetables = rootVegetables;
    }


}
