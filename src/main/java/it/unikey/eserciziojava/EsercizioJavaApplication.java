package it.unikey.eserciziojava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class EsercizioJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsercizioJavaApplication.class, args);

        /* CONNESSIONE AL DB TRAMITE JDBC DA RIVEDERE

        String connectionUrl =
                "jdbc:sqlserver://localhost;"
                        + "database=db_domanda;"
                        + "user=sa;"
                        + "password=Password.123;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement();) {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Crea ed esegui una SELECT SQL statement.
            String selectSql = "SELECT * FROM Domanda WHERE domandaObbligatoria = false";
            resultSet = statement.executeQuery(selectSql);

            // Stampa risultati della Select Statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(4));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

}
