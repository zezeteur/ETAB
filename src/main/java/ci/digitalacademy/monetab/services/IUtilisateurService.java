package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.Utilisateur;
import java.sql.SQLException;
import java.util.List;

public interface IUtilisateurService {
    public boolean authentification(String identifiant, String motDePasse) throws SQLException;
    public boolean ajouterCompte(String identifiant, String motDePasse);
    public boolean modifierMotDepass(String identifiant, String motDePasse);
    public boolean supprimerCompte(String identifiant, String motDePasse);
    public List<Utilisateur> listeUtilisateur();
}
