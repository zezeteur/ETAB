package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.Personne;

import java.util.List;
import java.util.Optional;

public interface PersonneService {

    Personne save(Personne personne);

    Personne update(Personne personne);

    Optional<Personne> findOne(Long id);

    List<Personne> findAll();

    void delete(Long id);

}
