package ci.digitalacademy.monetab.services.Impl;


import ci.digitalacademy.monetab.models.Eleve;
import ci.digitalacademy.monetab.repositories.EleveRepository;
import ci.digitalacademy.monetab.services.EleveService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class EleveServiceImpl implements EleveService {

    private final EleveRepository eleveRepository;
    

    @Override
    public Eleve save(Eleve eleve) {

        return eleveRepository.save(eleve);
    }

    @Override
    public Eleve update(Eleve eleve) {

        log.debug("Request to update Eleve{}", eleve);

        return null;
    }


    @Override
    public Optional<Eleve> findOne(Long id) {
        log.debug("Request to findOne Eleve{}", id);

        return eleveRepository.findById(id);
    }

    @Override
    public List<Eleve> findAll() {
        log.debug("Request to findAll Eleves");

        return eleveRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Eleve{}", id);

        eleveRepository.deleteById(id);

    }
    
}
