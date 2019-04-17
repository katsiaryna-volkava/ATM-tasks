package masterchief.service;

import masterchief.domain.MeatComponent;
import masterchief.domain.Salad;
import masterchief.domain.SaladIngredient;

import java.util.*;

public class SaladOperationsService {

    public List<String> findVegetarianSalads(Map<String, Salad> map) {

        boolean isVegetarian = true;
        List<String> salads = new ArrayList<>();

        for (Map.Entry<String, Salad> pair : map.entrySet()) {
            Salad salad = pair.getValue();
            for (SaladIngredient ingredient : salad.getIngredients()) {
                if (ingredient instanceof MeatComponent) {
                    isVegetarian = false;
                    break;
                }
            }
            if (isVegetarian == true) {
                salads.add(pair.getKey());
            }
            isVegetarian = true;
        }
        return salads;
    }

    public List<String> findSaladsWithGrilledMeat(Map<String, Salad> map) {
        List<String> salads = new ArrayList<>();

        for (Map.Entry<String, Salad> pair : map.entrySet()) {
            Salad salad = pair.getValue();
            for (SaladIngredient ingredient : salad.getIngredients()) {
                if (ingredient instanceof MeatComponent) {
                    MeatComponent meatComponent = (MeatComponent) ingredient;
                    if (meatComponent.isGrilled()) {
                        salads.add(pair.getKey());
                        break;
                    }

                }
            }

        }


        return salads;
    }


    public int calculateTheNumberOfCalories(Salad salad) {
        int sum = 0;
        for (SaladIngredient ingredient : salad.getIngredients()) {
            sum += ingredient.getCalories();
        }
        return sum;
    }

    public double calculateFat(Salad salad) {
        double sum = 0;
        for (SaladIngredient ingredient : salad.getIngredients()) {
            sum += ingredient.getFat();
        }
        return sum;
    }

    public double calculateProtein(Salad salad) {
        double sum = 0;
        for (SaladIngredient ingredient : salad.getIngredients()) {
            sum += ingredient.getProtein();
        }
        return sum;
    }

    public double calculateCarbohydrates(Salad salad) {
        double sum = 0;
        for (SaladIngredient ingredient : salad.getIngredients()) {
            sum += ingredient.getCarbohydrates();
        }
        return sum;
    }


}
