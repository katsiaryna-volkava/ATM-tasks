package masterchief.data.repository;

import java.sql.SQLException;

public class Flavour extends BaseTable implements TableOperations {

    public Flavour() throws SQLException {
        super("flavour");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS flavour(id BIGINT AUTO_INCREMENT primary key,\n" +
                "                flavour_name VARCHAR(255)NOT NULL,\n" +
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
        super.executeSqlStatement("INSERT INTO flavour (flavour_name, calories, carbohydrates, fat, protein)" +
                "VALUES ('olive_oil', 150, 12.3, 0.0, 0.3)");
        super.executeSqlStatement("INSERT INTO flavour (flavour_name, calories, carbohydrates, fat, protein)" +
                "VALUES ('mayonnaise', 100, 23.5, 16.5, 5.6)");
        super.executeSqlStatement("INSERT INTO flavour (flavour_name, calories, carbohydrates, fat, protein)" +
                "VALUES ('sour_cream', 50, 12.0, 20.3, 10.2)");
        super.executeSqlStatement("INSERT INTO flavour (flavour_name, calories, carbohydrates, fat, protein)" +
                "VALUES ('nothing', null, null, null, null)");
    }
}
