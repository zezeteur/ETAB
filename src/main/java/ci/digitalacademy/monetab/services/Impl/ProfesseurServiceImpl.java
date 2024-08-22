package ci.digitalacademy.monetab.services.Impl;


import ci.digitalacademy.monetab.models.Professeur;
import ci.digitalacademy.monetab.repositories.ProfesseurRepository;
import ci.digitalacademy.monetab.services.ProfesseurService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProfesseurServiceImpl implements ProfesseurService {

    private final ProfesseurRepository professeurRepository;

    @Override
    public Professeur save(Professeur professeur) {

        return professeurRepository.save(professeur);
    }

    @Override
    public Professeur update(Professeur professeur) {

        log.debug("Request to update Professeur{}", professeur);

        return null;
    }


    @Override
    public Optional<Professeur> findOne(Long id) {
        log.debug("Request to findOne Professeur{}", id);

        return professeurRepository.findById(id);
    }

    @Override
    public List<Professeur> findAll() {
        log.debug("Request to findAll Professeurs");

        return professeurRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Professeur{}", id);

        professeurRepository.deleteById(id);

    }
    
}
