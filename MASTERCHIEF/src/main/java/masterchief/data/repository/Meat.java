package masterchief.data.repository;

import java.sql.SQLException;

public class Meat extends BaseTable implements TableOperations {

    public Meat() throws SQLException {
        super("meat_ingredient");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS meat_ingredient(id BIGINT AUTO_INCREMENT primary key,\n" +
                "                meat_name VARCHAR(255)NOT NULL,\n" +
                "                is_grilled BOOLEAN NOT NULL,\n" +
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
        super.executeSqlStatement("INSERT INTO meat_ingredient (meat_name, is_grilled, calories, carbohydrates, fat, protein)" +
                "VALUES ('beef', true, 50, 10.0, 4.6, 14.2)");
        super.executeSqlStatement("INSERT INTO meat_ingredient (meat_name, is_grilled, calories, carbohydrates, fat, protein)" +
                "VALUES ('chicken', true, 30, 5.3, 2.6, 12.0)");
        super.executeSqlStatement("INSERT INTO meat_ingredient (meat_name, is_grilled, calories, carbohydrates, fat, protein)" +
                "VALUES ('ham', false, 70, 15.6, 14.6, 6.7)");

    }

}
