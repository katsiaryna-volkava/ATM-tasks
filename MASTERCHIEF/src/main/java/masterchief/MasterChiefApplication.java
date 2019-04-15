package masterchief;

import masterchief.domain.enumerations.VegetableType;
import masterchief.service.SaladOperationsService;

public class MasterChiefApplication {


    public static void main(String[] args) {


    SaladOperationsService service = new SaladOperationsService();


    // creation of first object - greek salad
    Salad greekSalad = createDefaultSalad("greek");
    greekSalad.add(new Ingredient("tomato", 100, 18, 3.9, 0.2, 0.9, VegetableType.FRUIT));
    greekSalad.add(new Ingredient("cucumber", 100, 16, 2.9, 0.2, 0.8, VegetableType.FRUIT));
    greekSalad.add(new Ingredient("pepper", 100, 27, 6.3, 0.2, 1.0, VegetableType.FRUIT));
    greekSalad.add(new Ingredient("olives", 100, 145, 3.84, 15.32, 1.03, VegetableType.FRUIT));
   // System.out.println("The total of calories for " + greekSalad.getName() + " salad is: " + service.calculateTheNumberOfCalories(greekSalad));

    // creation of second object - tomato salad
    Salad tomatoSalad = createDefaultSalad("tomato");
    tomatoSalad.add(new Ingredient("tomato", 100, 18, 3.9, 0.2, 0.9, VegetableType.FRUIT));
   // System.out.println("The total of calories for " + tomatoSalad.getName() + " salad is: " + service.calculateTheNumberOfCalories(tomatoSalad));

    // creation of third object - default (lettuce) salad
    Salad lettuceOnlySalad = createDefaultSalad("lettuce");
   // System.out.println("The total of calories for " + lettuceOnlySalad.getName() + " salad is: " + service.calculateTheNumberOfCalories(lettuceOnlySalad));


        System.out.println("The total of calories for " + greekSalad.getName() + " salad is: " + service.calculateTheNumberOfCalories(greekSalad));
        System.out.println("The total of calories for " + tomatoSalad.getName() + " salad is: " + service.calculateTheNumberOfCalories(tomatoSalad));
        System.out.println("The total of calories for " + lettuceOnlySalad.getName() + " salad is: " + service.calculateTheNumberOfCalories(lettuceOnlySalad));

}

    public static Salad createDefaultSalad (String name) {
        Salad salad = new Salad(name);
        salad.add(new Ingredient("lettuce", 100, 151, 2.8, 0.2, 1.4, VegetableType.LEAF));

        return salad;

    }


}
