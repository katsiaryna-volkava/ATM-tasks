package masterchief.domain;

import java.util.Objects;

public abstract class Vegetable {
    private String name;
    private Integer weight;
    private Integer calories;
    private Double carbohydrates;
    private Double fat;
    private Double protein;
    private VegetableType type;

    public Vegetable(String name, Integer weight, Integer calories, Double carbohydrates, Double fat, Double protein, VegetableType type) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
        this.protein = protein;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
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

    public VegetableType getType() {
        return type;
    }

    public void setType(VegetableType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return Objects.equals(name, vegetable.name) &&
                Objects.equals(weight, vegetable.weight) &&
                Objects.equals(calories, vegetable.calories) &&
                Objects.equals(carbohydrates, vegetable.carbohydrates) &&
                Objects.equals(fat, vegetable.fat) &&
                Objects.equals(protein, vegetable.protein) &&
                type == vegetable.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, weight, calories, carbohydrates, fat, protein, type);
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", calories=" + calories +
                ", carbohydrates=" + carbohydrates +
                ", fat=" + fat +
                ", protein=" + protein +
                ", type=" + type +
                '}';
    }
}
