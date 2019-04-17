package masterchief;

import masterchief.domain.*;
import masterchief.domain.enumerations.VegetableType;
import masterchief.service.SaladOperationsService;

import java.util.HashMap;
import java.util.Map;

public class MasterChiefApplication {


    private static final Map<String, Salad> SALADS_LIST;

    /*
     private static final Map<String, VegetableComponent> VEGETABLE_INGREDIENTS;
     private static final Map<String, MeatComponent> MEAT_INGREDIENTS;
     private static final Map<String, Flavour> FLAVOR_COMPONENT;

*/
    static {
        SALADS_LIST = new HashMap<>();

        /*
        VEGETABLE_INGREDIENTS = new HashMap<>();
        MEAT_INGREDIENTS = new HashMap<>();
        FLAVOR_COMPONENT = new HashMap<>();
        */

        VegetableComponent tomato = new VegetableComponent(18, 3.9, 0.2, 0.9, "tomato", VegetableType.FRUIT);
        VegetableComponent cucumber = new VegetableComponent(16, 2.9, 0.2, 0.8, "cucumber", VegetableType.FRUIT);
        VegetableComponent pepper = new VegetableComponent(27, 6.3, 0.2, 1.0, "pepper", VegetableType.FRUIT);
        VegetableComponent olives = new VegetableComponent(145, 3.84, 15.32, 1.03, "olives", VegetableType.FRUIT);
        VegetableComponent lettuce = new VegetableComponent(18, 3.9, 0.2, 0.9, "lettuce", VegetableType.LEAF);

        MeatComponent beef = new MeatComponent(50, 10.0, 4.6, 14.2, "beef", true);
        MeatComponent chicken = new MeatComponent(30, 5.3, 2.6, 12.0, "chicken", true);
        MeatComponent ham = new MeatComponent(70, 15.6, 14.6, 6.7, "ham", false);

        Flavour olive_oil = new Flavour(150, 12.3, 0.0, 0.3, "olive oil");
        Flavour mayonnaise = new Flavour(100, 23.5, 16.5, 5.6, "mayonnaise");
        Flavour sour_cream = new Flavour(50, 12.0, 20.3, 10.2, "sour cream");

        /*
        VEGETABLE_INGREDIENTS.put("tomato", tomato);
        VEGETABLE_INGREDIENTS.put("cucumber", cucumber);
        VEGETABLE_INGREDIENTS.put("pepper", pepper);
        VEGETABLE_INGREDIENTS.put("olives", olives);
        VEGETABLE_INGREDIENTS.put("lettuce", lettuce);

        MEAT_INGREDIENTS.put("beef", beef);
        MEAT_INGREDIENTS.put("chicken", chicken);
        MEAT_INGREDIENTS.put("ham", ham);

        FLAVOR_COMPONENT.put("olive oil", olive_oil);
        FLAVOR_COMPONENT.put("mayonnaise", mayonnaise);
        FLAVOR_COMPONENT.put("sour cream", sour_cream);
        */

        Salad greekSalad = new Salad("greek");
        greekSalad.add(tomato);
        greekSalad.add(cucumber);
        greekSalad.add(pepper);
        greekSalad.add(olives);
        greekSalad.add(olive_oil);

        Salad tomatoSalad = new Salad("tomato salad");
        tomatoSalad.add(tomato);
        tomatoSalad.add(sour_cream);

        Salad caesarSalad = new Salad("caesar salad");
        caesarSalad.add(tomato);
        caesarSalad.add(lettuce);
        caesarSalad.add(mayonnaise);
        caesarSalad.add(chicken);

        Salad beefSalad = new Salad("salad with beef");
        beefSalad.add(beef);
        beefSalad.add(lettuce);
        beefSalad.add(tomato);
        beefSalad.add(cucumber);


        SALADS_LIST.put("greek salad", greekSalad);
        SALADS_LIST.put("tomato salad", tomatoSalad);
        SALADS_LIST.put("salad with beef", beefSalad);
        SALADS_LIST.put("caesar salad", caesarSalad);


    }

    public static void main(String[] args) {


        SaladOperationsService service = new SaladOperationsService();

        // 1
        // посчитать калорийность салата греческого салата
        System.out.println("The total of calories for " + SALADS_LIST.get("greek salad").getName() + " salad is: " + service.calculateTheNumberOfCalories(SALADS_LIST.get("greek salad")));

        // 2
        // посчитать кол-во углеводов в салате Цезарь
        System.out.println("The total of carbohydrates for " + SALADS_LIST.get("caesar salad").getName() + " salad is: " + service.calculateCarbohydrates(SALADS_LIST.get("caesar salad")));

        //  3
        // посчитать кол-во жиров в салате с говядиной
        System.out.println("The total of fat for " + SALADS_LIST.get("caesar salad").getName() + " salad is: " + service.calculateFat(SALADS_LIST.get("caesar salad")));

        //  4
        // посчитать кол-во белков в салате из помидоров
        System.out.println("The total of protein for " + SALADS_LIST.get("tomato salad").getName() + " salad is: " + service.calculateProtein(SALADS_LIST.get("tomato salad")));


        // Найти овощи в салате,соответствующие заданному диапазону параметров


        //  5
        // Найти салаты, состоящие только из овощей -- вегетарианские салаты
        System.out.println("The vegetarian salads are: " + service.findVegetarianSalads(SALADS_LIST));

        // 6
        // Найти салаты, в которых есть компонент пожаренный на гриле
        System.out.println("Salads with grilled meat are: " + service.findSaladsWithGrilledMeat(SALADS_LIST));


        // тест 7
        // отсортировать салаты по калорийности в natural order


    }

}
