package masterchief.data.model;

import masterchief.domain.enumerations.VegetableType;

public class VegetableIngredient extends BaseModel {

    private String vegetable_name;
    private VegetableType vegetable_type;
    private int calories;
    private double carbohydrates;
    private double fat;
    private double protein;

    public VegetableIngredient() {
    }

    public VegetableIngredient(long id, String vegetable_name, VegetableType vegetable_type, int calories, double carbohydrates, double fat, double protein) {
        super(id);
        this.vegetable_name = vegetable_name;
        this.vegetable_type = vegetable_type;
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
        this.protein = protein;
    }

    public String getVegetable_name() {
        return vegetable_name;
    }

    public void setVegetable_name(String vegetable_name) {
        this.vegetable_name = vegetable_name;
    }

    public VegetableType getVegetable_type() {
        return vegetable_type;
    }

    public void setVegetable_type(VegetableType vegetable_type) {
        this.vegetable_type = vegetable_type;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }
}
