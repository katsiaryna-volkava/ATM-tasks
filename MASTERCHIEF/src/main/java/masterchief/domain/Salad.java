package masterchief.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonAutoDetect
public class Salad {
    private String name;
    private List<SaladIngredient> ingredients;

    public Salad (String name){
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public Salad() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add (SaladIngredient ingredient) {
        ingredients.add(ingredient);
    }

    public void remove (SaladIngredient ingredient) {
        ingredients.remove(ingredient);
    }

    public final List<SaladIngredient> getIngredients() {
        return new ArrayList<>(ingredients);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salad salad = (Salad) o;
        return Objects.equals(name, salad.name) &&
                Objects.equals(ingredients, salad.ingredients);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, ingredients);
    }

    @Override
    public String toString() {
        return "Salad{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
