package ci.digitalacademy.monetab.repositories.Impl;

import ci.digitalacademy.monetab.repositories.IEleveDao;
import ci.digitalacademy.monetab.repositories.SingletonDataBase;
import ci.digitalacademy.monetab.models.Eleve;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EleveDaoImpl implements IEleveDao {


    @Override
    public Eleve Ajouter(Eleve eleve) {



        try {
            String query = "INSERT INTO eleve (classe, matricule) VALUES (?, ?)";
            PreparedStatement statement = SingletonDataBase.getInstance().prepareStatement(query);
            statement.setString(1, eleve.getClasse());
            statement.setString(2, eleve.getMatricule());

            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
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
