package ci.digitalacademy.monetab.services.Impl;


import ci.digitalacademy.monetab.models.Personne;
import ci.digitalacademy.monetab.repositories.PersonneRepository;
import ci.digitalacademy.monetab.services.PersonneService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class PersonneServiceImpl implements PersonneService {

    private final PersonneRepository personneRepository;


    @Override
    public Personne save(Personne personne) {

        return personneRepository.save(personne);
    }

    @Override
    public Personne update(Personne personne) {

        log.debug("Request to update Personne{}", personne);

        return null;
    }


    @Override
    public Optional<Personne> findOne(Long id) {
        log.debug("Request to findOne Personne{}", id);

        return personneRepository.findById(id);
    }

    @Override
    public List<Personne> findAll() {
        log.debug("Request to findAll Personnes");

        return personneRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Personne{}", id);

        personneRepository.deleteById(id);

    }


}
