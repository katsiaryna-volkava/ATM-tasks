package masterchief;

import masterchief.data.MasterChiefDB;
import masterchief.data.MasterChiefJSON;
import masterchief.domain.*;
import masterchief.domain.enumerations.VegetableType;
import masterchief.exception.EmptySaladException;
import masterchief.exception.MissingProteinInfoException;
import masterchief.exception.SaladAlreadyExistException;
import masterchief.service.SaladOperationsService;
import masterchief.service.SaladValidationService;

import java.io.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class MasterChiefApplication {
    private static final Map<String, Salad> SALADS_LIST;

    static {
        SALADS_LIST = new HashMap<>();

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
        Flavour nothing = new Flavour();

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

        Salad saladWhereFlavourIsWithoutFields = new Salad("salad with no flavour");
        saladWhereFlavourIsWithoutFields.add(lettuce);
        saladWhereFlavourIsWithoutFields.add(nothing);


        SALADS_LIST.put("greek salad", greekSalad);
        SALADS_LIST.put("tomato salad", tomatoSalad);
        SALADS_LIST.put("salad with beef", beefSalad);
        SALADS_LIST.put("caesar salad", caesarSalad);
        SALADS_LIST.put("salad with no flavour", saladWhereFlavourIsWithoutFields);

    }

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

        File file = new File("C:\\Users\\Katsiaryna_Volkava\\Documents\\mentoring\\auto\\idea\\json_file.txt");

        SaladOperationsService operationService = new SaladOperationsService();
        SaladValidationService validationService = new SaladValidationService();
        MasterChiefDB db = new MasterChiefDB();
        MasterChiefJSON json = new MasterChiefJSON();


        // 1 --- посчитать калорийность греческого салата
        operationService.consoleOutputAndFileWriter("The total of calories for "
                + SALADS_LIST.get("greek salad").getName()
                + " salad is: " + operationService.calculateTheNumberOfCalories(SALADS_LIST.get("greek salad")));


        // 2 --- посчитать кол-во углеводов в салате Цезарь
        operationService.consoleOutputAndFileWriter("The total of fat for "
                + SALADS_LIST.get("caesar salad").getName()
                + " salad is: " + operationService.calculateFat(SALADS_LIST.get("caesar salad")));

        //  3 --- посчитать кол-во жиров в салате с говядиной
        operationService.consoleOutputAndFileWriter("The total of fat for "
                + SALADS_LIST.get("caesar salad").getName()
                + " salad is: " + operationService.calculateFat(SALADS_LIST.get("caesar salad")));


        //  4 --- посчитать кол-во белков в салате из помидоров
        operationService.consoleOutputAndFileWriter("The total of protein for "
                + SALADS_LIST.get("tomato salad").getName() + " salad is: "
                + operationService.calculateProtein(SALADS_LIST.get("tomato salad")));


        //  5 --- Найти салаты, состоящие только из овощей -- вегетарианские салаты
        operationService.consoleOutputAndFileWriter("The vegetarian salads are: "
                + operationService.findVegetarianSalads(SALADS_LIST));

        // 6 --- Найти салаты, в которых есть компонент пожаренный на гриле
        operationService.consoleOutputAndFileWriter("Salads with grilled meat are: "
                + operationService.findSaladsWithGrilledMeat(SALADS_LIST));


        // тест 7 --- отсортировать салаты по калорийности в natural order

        // 8 --- первое пользовательское исключение - в салате нет ингридиентов
        try {
            validationService.checkThatSaladIsNotEmpty(new Salad("empty salad"));
        } catch (EmptySaladException e) {
            operationService.consoleOutputAndFileWriter(e.getMessage());
        }

        // 9 --- второе пользовательское исключение - салат с таким именем уже существует
        try {
            validationService.checkIfSpecifiedSaladExists(SALADS_LIST, "tomato salad");
        } catch (SaladAlreadyExistException e) {
            operationService.consoleOutputAndFileWriter(e.getMessage());
        }


        // 9 --- третье пользовательское исключение - когда в салате есть ингриденты без нужных полей (без указания кол-ва белка)
        try {
            validationService.checkIfPossibleToCalculateProteins(SALADS_LIST);
        } catch (MissingProteinInfoException e) {
            operationService.consoleOutputAndFileWriter(e.getMessage());
        }

        // 10 чтение из БД -- прочитать названия существующих в БД овощных ингридиентов
        try {
            db.createTables();
            // db.fillTablesWithData();
            db.getVegetables();
        } catch (Exception e) {
            operationService.consoleOutputAndFileWriter(e.getMessage());
        }

        // 11 чтение объекта из json-файла
        String result = json.readIngredientNutritionInfoFromFile(file);
        operationService.consoleOutputAndFileWriter(result);

    }

}
