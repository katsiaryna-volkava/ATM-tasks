package masterchief.service;

import masterchief.domain.MeatComponent;
import masterchief.domain.Salad;
import masterchief.domain.SaladIngredient;
import masterchief.exception.EmptySaladException;
import masterchief.exception.MissingProteinInfoException;
import masterchief.exception.SaladAlreadyExistException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class SaladValidationService {

    public void checkThatSaladIsNotEmpty(Salad salad) {
        if (salad.getIngredients().isEmpty()) {
            throw new EmptySaladException("There are no ingredients in the salad", salad.getName());
        }
    }

    public void checkIfSpecifiedSaladExists(Map<String, Salad> map, String inputSaladName) throws IOException {
        for (Map.Entry<String, Salad> pair : map.entrySet()) {
            String saladName = pair.getKey();
            if (inputSaladName.equals(saladName)) {
                throw new SaladAlreadyExistException("Salad with this name already exist", saladName);
            }
        }
    }

    public void checkIfPossibleToCalculateProteins(Map<String, Salad> map) {
        for (Map.Entry<String, Salad> pair : map.entrySet()) {
            Salad salad = pair.getValue();
            for (SaladIngredient ingredient : salad.getIngredients()) {
                if (ingredient.getProtein() == null) {
                    throw new MissingProteinInfoException("Some ingredient protein info is missing", salad.getName());
                }
            }
        }
    }
}
