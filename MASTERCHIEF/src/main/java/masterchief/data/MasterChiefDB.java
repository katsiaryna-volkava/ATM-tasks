package masterchief.data;

import masterchief.data.repository.Flavour;
import masterchief.data.repository.Meat;
import masterchief.data.repository.Vegetable;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MasterChiefDB {

    public static final String DB_URL = "jdbc:h2:/C:\\Users\\Katsiaryna_Volkava\\Documents\\mentoring\\auto\\idea\\ATM\\MASTERCHIEF\\db\\masterChief";
    public static final String DB_Driver = "org.h2.Driver";


    // Получить новое соединение с БД
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    Flavour flavour;
    Meat meat;
    Vegetable vegetable;


    // Инициализация
    public MasterChiefDB() throws SQLException, ClassNotFoundException {
        Class.forName(DB_Driver);
        // Инициализируем таблицы
        flavour = new Flavour();
        meat = new Meat();
        vegetable = new Vegetable();
    }

    // Создание всех таблиц
    public void createTables() throws SQLException {
        flavour.createTable();
        meat.createTable();
        vegetable.createTable();
    }

    public void fillTablesWithData() throws SQLException {
        flavour.fillInTableWithData();
        meat.fillInTableWithData();
        vegetable.fillInTableWithData();
    }

    public List<String> getVegetables() throws SQLException {
        List<String> vegs = new ArrayList<>();
        Connection conn = getConnection();
        ResultSet resultSet = null;
        Statement statement = null;

        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT VEGETABLE_NAME FROM vegetable_ingredient");
            while (resultSet.next()) {
                vegs.add(resultSet.getString(1));
            }
        } catch (Exception e) {
            System.out.println("Exception was found" + e);
        }
        System.out.println("Vegetables found in DB are:" + vegs);
        return vegs;
    }




    /*public static void main(String[] args) {
        try {
            Class.forName(DB_Driver); //Проверяем наличие JDBC драйвера для работы с БД
            Connection connection = DriverManager.getConnection(DB_URL);//соединение с БД
            System.out.println("Connection to DB is completed successfully");
            connection.close();       // отключение от БД
            System.out.println("DB is disconnected successfully");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // обработка ошибки  Class.forName
            System.out.println("JDBC driver for DB is not found");
        } catch (SQLException e) {
            e.printStackTrace(); // обработка ошибок  DriverManager.getConnection
            System.out.println("There is an SQL error");
        }
    }*/
}
