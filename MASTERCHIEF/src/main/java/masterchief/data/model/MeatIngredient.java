package masterchief.data.model;

public class MeatIngredient extends BaseModel {
    private String meat_name;
    private boolean isGrilled;
    private int calories;
    private double carbohydrates;
    private double fat;
    private double protein;

    public MeatIngredient() {
    }

    public MeatIngredient(long id, String name, boolean isGrilled, int calories, double carbohydrates, double fat, double protein) {
        super(id);
        this.meat_name = name;
        this.isGrilled = isGrilled;
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
        this.protein = protein;
    }

    public String getMeat_name() {
        return meat_name;
    }

    public void setMeat_name(String meat_name) {
        this.meat_name = meat_name;
    }

    public boolean isGrilled() {
        return isGrilled;
    }

    public void setGrilled(boolean grilled) {
        isGrilled = grilled;
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
