package masterchief.domain;

import java.util.Objects;

public abstract class SaladIngredient {
    private Integer calories;
    private Double carbohydrates;
    private Double fat;
    private Double protein;


    public SaladIngredient(Integer calories, Double carbohydrates, Double fat, Double protein) {
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
        this.protein = protein;
    }

    public SaladIngredient() {

    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaladIngredient that = (SaladIngredient) o;
        return Objects.equals(calories, that.calories) &&
                Objects.equals(carbohydrates, that.carbohydrates) &&
                Objects.equals(fat, that.fat) &&
                Objects.equals(protein, that.protein);
    }

    @Override
    public int hashCode() {

        return Objects.hash(calories, carbohydrates, fat, protein);
    }

    @Override
    public String toString() {
        return "SaladIngredient{" +
                "calories=" + calories +
                ", carbohydrates=" + carbohydrates +
                ", fat=" + fat +
                ", protein=" + protein +
                '}';
    }
}
