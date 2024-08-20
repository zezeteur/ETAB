package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.repositories.IUtilisateurDao;
import ci.digitalacademy.monetab.repositories.Impl.UtilisateurDaoImpl;
import ci.digitalacademy.monetab.models.Utilisateur;
import ci.digitalacademy.monetab.services.IUtilisateurService;

import java.sql.SQLException;
import java.util.List;

public class UtilisateurService implements IUtilisateurService {

    private IUtilisateurDao utilisateurDao;

    public UtilisateurService() {
        this.utilisateurDao = new UtilisateurDaoImpl();
    }

    @Override
    public boolean authentification(String identifiant, String motDePasse) throws SQLException {
        Utilisateur user = utilisateurDao.getUser(identifiant,motDePasse);
        return user!=null;
    }


    @Override
    public boolean ajouterCompte(String identifiant, String motDePasse) {
        return false;
    }

    @Override
    public boolean modifierMotDepass(String identifiant, String motDePasse) {
        return false;
    }

    @Override
    public boolean supprimerCompte(String identifiant, String motDePasse) {
        return false;
    }

    @Override
    public List<Utilisateur> listeUtilisateur() {
        return List.of();
    }
}
