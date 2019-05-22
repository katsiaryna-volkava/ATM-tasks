package masterchief.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Objects;

@JsonAutoDetect
public class MeatComponent extends SaladIngredient {
    private String name;
    private boolean isGrilled;

    public MeatComponent(Integer calories, Double carbohydrates, Double fat, Double protein, String name, boolean isGrilled) {
        super(calories, carbohydrates, fat, protein);
        this.name = name;
        this.isGrilled = isGrilled;
    }

    public MeatComponent() {
    }

    public boolean isGrilled() {
        return isGrilled;
    }

    public void setGrilled(boolean grilled) {
        isGrilled = grilled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MeatComponent that = (MeatComponent) o;
        return isGrilled == that.isGrilled &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), name, isGrilled);
    }

    @Override
    public String toString() {
        return "MeatComponent{" +
                "name='" + name + '\'' +
                ", isGrilled=" + isGrilled +
                '}';
    }
}
