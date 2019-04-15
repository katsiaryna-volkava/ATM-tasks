package masterchief.service;

import masterchief.Salad;

public class SaladOperationsService {

    public int calculateTheNumberOfCalories (Salad salad) {
        int sum = 0;
        for (Ingredient ingredient : salad.getIngredients()) {
            sum += ingredient.getCalories();
        }
        return sum;
    }

    public double calculateFat (Salad salad) {
        double sum = 0;
        for (Ingredient ingredient : salad.getIngredients()) {
            sum += ingredient.getFat();
        }
        return sum;
    }

    public double calculateProtein (Salad salad) {
        double sum = 0;
        for (Ingredient ingredient : salad.getIngredients()) {
            sum += ingredient.getProtein();
        }
        return sum;
    }

    public double calculateCarbohydrates (Salad salad) {
        double sum = 0;
        for (Ingredient ingredient : salad.getIngredients()) {
            sum += ingredient.getCarbohydrates();
        }
        return sum;
    }

}
