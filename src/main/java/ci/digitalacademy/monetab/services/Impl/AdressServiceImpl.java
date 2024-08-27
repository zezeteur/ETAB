package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.Adress;
import ci.digitalacademy.monetab.repositories.AdressRepository;
import ci.digitalacademy.monetab.services.AdressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class AdressServiceImpl implements AdressService {


    private final AdressRepository adressRepository;

    @Override
    public Adress save(Adress adress) {

        return adressRepository.save(adress);
    }

    @Override
    public Adress update(Adress adress) {

        log.debug("Request to update Adresse{}", adress);

        return null;
    }



    @Override
    public Optional<Adress> findOne(Long id) {
        log.debug("Request to findOne Adresse{}", id);

        return adressRepository.findById(id);
    }

    @Override
    public List<Adress> findAll() {
        log.debug("Request to findAll Adresses");

        return adressRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Adresse{}", id);

        adressRepository.deleteById(id);

    }
}
