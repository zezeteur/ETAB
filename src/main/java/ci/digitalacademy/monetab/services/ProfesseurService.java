package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.Professeur;

import java.util.List;
import java.util.Optional;

public interface ProfesseurService {

    Professeur save(Professeur professeur);

    Professeur update(Professeur professeur);

    Optional<Professeur> findOne(Long id);

    List<Professeur> findAll();

    void delete(Long id);
}
