package ci.digitalacademy.monetab.services.Impl;


import ci.digitalacademy.monetab.models.Person;
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
    public Person save(Person person) {

        return personneRepository.save(person);
    }

    @Override
    public Person update(Person person) {

        log.debug("Request to update Personne{}", person);

        return null;
    }


    @Override
    public Optional<Person> findOne(Long id) {
        log.debug("Request to findOne Personne{}", id);

        return personneRepository.findById(id);
    }

    @Override
    public List<Person> findAll() {
        log.debug("Request to findAll Personnes");

        return personneRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Personne{}", id);

        personneRepository.deleteById(id);

    }


}
