package masterchief.domain.enumerations;

public enum Flavour {
    OLIVE_OIL (0, 0, 13, 80),
    MAYONNAISE_SAUCE (5, 20, 15, 150),
    SOUR_CREAM (6, 7, 10, 120);

    //Nutrition facts (for 1 portion)
    private final double proteins;
    private final double carbohydrates;
    private final double fats;
    private final double calories;

    Flavour(double proteins, double carbs, double fats, double cal) {
        this.proteins = proteins;
        this.carbohydrates = carbs;
        this.fats = fats;
        this.calories = cal;
    }

    public double getProteins() {
        return proteins;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getFats() {
        return fats;
    }

    public double getCalories() {
        return calories;
    }
}
