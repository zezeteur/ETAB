package ci.digitalacademy.monetab.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonDataBase {
    private final static String URL="jdbc:mysql://localhost:3306/etab_db";
    private final static String USERNAME="root";// Mot de pass
    private final static String PASSWORD="";

    static Connection connection;

    private SingletonDataBase(){
        try  {
            // Création d'une nouvelle connexion à la base de données
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            //
            System.out.println(e.getMessage());
        }
    }

    public static Connection getInstance(){
        if(connection==null){
          new SingletonDataBase();
        }
        return connection;
    }
}
