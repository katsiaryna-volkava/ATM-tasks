package masterchief.domain;

import masterchief.domain.SaladIngredient;

public class Flavour extends SaladIngredient {
    private String name;

    public Flavour(Integer calories, Double carbohydrates, Double fat, Double protein, String name) {
        super(calories, carbohydrates, fat, protein);
        this.name = name;
    }

    public Flavour() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
