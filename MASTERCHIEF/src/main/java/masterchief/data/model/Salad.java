package masterchief.data.model;

import java.util.List;

public class Salad extends BaseModel {
    private String salad_name;

   // private массив ингридентов ??


    public String getSalad_name() {
        return salad_name;
    }

    public void setSalad_name(String salad_name) {
        this.salad_name = salad_name;
    }
}
