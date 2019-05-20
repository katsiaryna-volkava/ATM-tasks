package masterchief.data.repository;

import java.sql.SQLException;

public interface TableOperations {

    void createTable() throws SQLException;
    void createForeignKeys() throws SQLException;
    void fillInTableWithData() throws SQLException;


}
