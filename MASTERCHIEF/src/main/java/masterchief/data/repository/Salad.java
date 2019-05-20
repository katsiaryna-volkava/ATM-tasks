package masterchief.data.repository;

import java.sql.SQLException;

public class Salad extends BaseTable implements TableOperations {


    public Salad() throws SQLException {
        super("salad");
    }


    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS salad(id BIGINT AUTO_INCREMENT primary key,\n" +
                "                meat_name VARCHAR(255)NOT NULL,\n" +
                "                salad_name VARCHAR(255) NOT NULL)");



    }


    @Override
    public void createForeignKeys() throws SQLException {

    }

    @Override
    public void fillInTableWithData() throws SQLException {
        super.executeSqlStatement("INSERT INTO salad (salad_name) VALUES ('greek salad')");
        super.executeSqlStatement("INSERT INTO salad (salad_name) VALUES ('caesar salad')");
        super.executeSqlStatement("INSERT INTO salad (salad_name) VALUES ('tomato salad')");
        super.executeSqlStatement("INSERT INTO salad (salad_name) VALUES ('salad with beef salad')");
    }
}
