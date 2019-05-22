package masterchief.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import masterchief.domain.MeatComponent;

import java.io.*;


public class MasterChiefJSON {

    public String readIngredientNutritionInfoFromFile (File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        ObjectMapper mapper = new ObjectMapper();

        String stringJson;
        MeatComponent component = null;

        while (reader.ready()) {
            stringJson = reader.readLine();
            component = mapper.readValue(stringJson, MeatComponent.class);
            
        }
        reader.close();
        return "New ingredient found in a json-file is: " + component.getName();
    }
}
