package masterchief.data.model;

public class FlavourIngredient extends BaseModel {
    private String flavour_name;
    private int calories;
    private double carbohydrates;
    private double fat;
    private double protein;

    public FlavourIngredient() {}

    public FlavourIngredient(long id, String flavour_name, int calories, double carbohydrates, double fat, double protein) {
        super(id);
        this.flavour_name = flavour_name;
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
        this.protein = protein;
    }

    public String getFlavour_name() {
        return flavour_name;
    }

    public void setFlavour_name(String flavour_name) {
        this.flavour_name = flavour_name;
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
