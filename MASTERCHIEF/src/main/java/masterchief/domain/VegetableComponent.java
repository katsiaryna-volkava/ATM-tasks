package masterchief.domain;

import masterchief.domain.enumerations.VegetableType;

import java.util.Objects;

public class VegetableComponent extends SaladIngredient {
    private String name;
    private VegetableType type;

    public VegetableComponent(Integer calories, Double carbohydrates, Double fat, Double protein, String name, VegetableType type) {
        super(calories, carbohydrates, fat, protein);
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!super.equals(o)) return false;
        VegetableComponent that = (VegetableComponent) o;
        return Objects.equals(name, that.name) &&
                type == that.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), name, type);
    }

    @Override
    public String toString() {
        return "VegetableComponent{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}


