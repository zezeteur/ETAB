package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.Eleve;

import java.util.List;
import java.util.Optional;

public interface EleveService {
    
    Eleve save(Eleve eleve);

    Eleve update(Eleve eleve);

    Optional<Eleve> findOne(Long id);

    List<Eleve> findAll();

    void delete(Long id);
}
