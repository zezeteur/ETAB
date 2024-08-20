package ci.digitalacademy.monetab.repositories;

import ci.digitalacademy.monetab.models.Utilisateur;
import java.sql.SQLException;
import java.util.List;

public interface IUtilisateurDao {
    public Utilisateur getUser(String identifiant, String motDePasse) throws SQLException;
    public Utilisateur updateUser(String identifiant, String motDePasse);
    public void deleteUser(String identifiant, String motDePasse);
    public List<Utilisateur> listeUtilisateur();

}