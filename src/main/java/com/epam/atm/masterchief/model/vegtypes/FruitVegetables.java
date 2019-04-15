package com.epam.atm.masterchief.model.vegtypes;

import com.epam.atm.masterchief.model.Vegetable;

import java.util.ArrayList;

public class FruitVegetables extends Vegetable {
    public FruitVegetables(String name, int weight, double calories, double carbohydrate, double fiber, double sugar, double protein, double fat) {
        super(name, weight, calories, carbohydrate, fiber, sugar, protein, fat);
    }

    public FruitVegetables(String name, int weight, int calories) {
        super(name, weight, calories);
    }

    ArrayList<Vegetable> fruitVegetables = new ArrayList<>();


    Vegetable tomato = new FruitVegetables("tomato", 100, 18, 3.9, 1.2, 2.6, 0.9, 0.2);
    Vegetable cucumber = new FruitVegetables("cucumber", 100, 15);
    Vegetable olives = new FruitVegetables("olives", 100, 115);


    public ArrayList<Vegetable> getFruitVegetables() {
        return fruitVegetables;
    }

    public void setFruitVegetables(ArrayList<Vegetable> fruitVegetables) {
        this.fruitVegetables = fruitVegetables;
    }
}
