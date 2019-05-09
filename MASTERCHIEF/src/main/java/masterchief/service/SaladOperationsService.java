package masterchief.service;

import masterchief.domain.MeatComponent;
import masterchief.domain.Salad;
import masterchief.domain.SaladIngredient;
import masterchief.exception.EmptySaladException;
import masterchief.exception.MissingProteinInfoException;
import masterchief.exception.SaladException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SaladOperationsService {

    public List<String> findVegetarianSalads(Map<String, Salad> map) throws SaladException{

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

    public List<String> findSaladsWithGrilledMeat(Map<String, Salad> map) throws SaladException{
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


    public int calculateTheNumberOfCalories(Salad salad) throws SaladException {
        int sum = 0;
        for (SaladIngredient ingredient : salad.getIngredients()) {
            sum += ingredient.getCalories();
        }
        return sum;
    }

    public double calculateFat(Salad salad) throws SaladException{
        double sum = 0;
        for (SaladIngredient ingredient : salad.getIngredients()) {
            sum += ingredient.getFat();
        }
        return sum;
    }

    public double calculateProtein(Salad salad) throws SaladException{
            double sum = 0;
            for (SaladIngredient ingredient : salad.getIngredients()) {
                sum += ingredient.getProtein();
            }
            return sum;
    }

    public double calculateCarbohydrates(Salad salad) throws SaladException{
        double sum = 0;
        for (SaladIngredient ingredient : salad.getIngredients()) {
            sum += ingredient.getCarbohydrates();
        }
        return sum;
    }

    public void consoleOutputAndFileWriter(String string) throws IOException {
        File file = new File("C:\\Users\\Katsiaryna_Volkava\\Documents\\mentoring\\auto\\1.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        System.out.println(string);
        bufferedWriter.write(string);
        bufferedWriter.close();
    }


}
