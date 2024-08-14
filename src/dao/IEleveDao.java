package dao;

import models.Eleve;
import java.util.List;

public interface IEleveDao {

    Eleve Ajouter(Eleve eleve);

    Eleve ajouter(Eleve eleve);

    Eleve modifier(Eleve eleve);
    void supprimer(int identifiant);
    Eleve Obtenir(int identifiant);
    List<Eleve> obtenirProfesseur();

}
