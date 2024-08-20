package ci.digitalacademy.monetab.repositories.Impl;

import ci.digitalacademy.monetab.models.Professeur;
import ci.digitalacademy.monetab.repositories.IProfesseurDao;
import ci.digitalacademy.monetab.models.Eleve;
import java.util.List;

public class ProfesseurDaoImpl implements IProfesseurDao {
    private Professeur professeur;

    @Override
    public Professeur Ajouter(Professeur professeur) {
        this.professeur = professeur;
        return null;
    }

    @Override
    public Professeur modifier(Professeur professeur) {
        return null;
    }

    @Override
    public void supprimer(int identifiant) {

    }

    @Override
    public List obtenirProfesseur() {
        return List.of();
    }

    @Override
    public void Obtenir(int identifiant) {

    }
}
