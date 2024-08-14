package dao.Impl;

import dao.IEleveDao;
import dao.SingletonDataBase;
import models.Eleve;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EleveDaoImpl implements IEleveDao {


    @Override
    public Eleve Ajouter(Eleve eleve) {


        Connection conn;
        PreparedStatement pstmt = null;

        try {
            // Obtenir la connexion depuis le singleton
            conn = SingletonDataBase.getInstance();

            // Créer la requête SQL
            String sql = "INSERT INTO nom_de_table (colonne1, colonne2) VALUES (?, ?)";
            pstmt = conn.prepareStatement(sql);

            // Définir les valeurs des paramètres
            pstmt.setString(1, eleve.getNom());
            pstmt.setString(2, eleve.getPrenom());

            // Exécuter la requête
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Nombre de lignes insérées : " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources
            try {
                if (pstmt != null) pstmt.close();
                // Pas besoin de fermer la connexion car elle est gérée par le singleton
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

















        return null;
    }

    @Override
    public Eleve ajouter(Eleve eleve) {
        return null;
    }

    @Override
    public Eleve modifier(Eleve eleve) {
        return null;
    }

    @Override
    public void supprimer(int identifiant) {

    }

    @Override
    public Eleve Obtenir(int identifiant) {
        return null;
    }

    @Override
    public List<Eleve> obtenirProfesseur() {
        return List.of();
    }
}
