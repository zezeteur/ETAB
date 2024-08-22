package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.Adresse;
import ci.digitalacademy.monetab.models.Adresse;
import ci.digitalacademy.monetab.repositories.AdresseRepository;
import ci.digitalacademy.monetab.repositories.AdresseRepository;
import ci.digitalacademy.monetab.services.AdresseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class AdresseServiceImpl implements AdresseService {


    private final AdresseRepository adresseRepository;

    @Override
    public Adresse save(Adresse adresse) {

        return adresseRepository.save(adresse);
    }

    @Override
    public Adresse update(Adresse adresse) {

        log.debug("Request to update Adresse{}", adresse);

        return null;
    }



    @Override
    public Optional<Adresse> findOne(Long id) {
        log.debug("Request to findOne Adresse{}", id);

        return adresseRepository.findById(id);
    }

    @Override
    public List<Adresse> findAll() {
        log.debug("Request to findAll Adresses");

        return adresseRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Adresse{}", id);

        adresseRepository.deleteById(id);

    }
}
