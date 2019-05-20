package masterchief.data.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Vegetable extends BaseTable implements TableOperations {
    public Vegetable() throws SQLException {
        super("vegetable_ingredient");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS vegetable_ingredient(id BIGINT AUTO_INCREMENT primary key,\n" +
                "                vegetable_name VARCHAR(255)NOT NULL,\n" +
                "                vegetable_type VARCHAR(255),\n" +
                "                calories INTEGER(8),\n" +
                "                carbohydrates DECIMAL(4, 2),\n" +
                "                fat DECIMAL(4, 2),\n" +
                "                protein DECIMAL(4, 2))");
    }

    @Override
    public void createForeignKeys() throws SQLException {

    }


    @Override
    public void fillInTableWithData() throws SQLException {
        super.executeSqlStatement("INSERT INTO vegetable_ingredient (vegetable_name, vegetable_type, calories, carbohydrates, fat, protein)" +
                "VALUES ('tomato', 'fruit', 18, 3.9, 0.2, 0.9)");
        super.executeSqlStatement("INSERT INTO vegetable_ingredient (vegetable_name, vegetable_type, calories, carbohydrates, fat, protein)" +
                "VALUES ('cucumber', 'fruit', 16, 2.9, 0.2, 0.8)");
        super.executeSqlStatement("INSERT INTO vegetable_ingredient (vegetable_name, vegetable_type, calories, carbohydrates, fat, protein)" +
                "VALUES ('pepper', 'fruit', 27, 6.3, 0.2, 1.0)");
        super.executeSqlStatement("INSERT INTO vegetable_ingredient (vegetable_name, vegetable_type, calories, carbohydrates, fat, protein)" +
                "VALUES ('olives', 'fruit', 145, 3.84, 15.32, 1.03)");
        super.executeSqlStatement("INSERT INTO vegetable_ingredient (vegetable_name, vegetable_type, calories, carbohydrates, fat, protein)" +
                "VALUES ('lettuce', 'leaf', 18, 3.9, 0.2, 0.9)");
    }

/*    public List<String> getVegetablesFromDB() throws SQLException {
        List<String> vegetables = new ArrayList<>();
        Connection connection =

        super.executeSqlStatement("select vegetable_name from vegetable_ingredient");
        return vegetables;
    }*/

}
