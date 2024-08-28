package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.Adress;
import ci.digitalacademy.monetab.repositories.AdressRepository;
import ci.digitalacademy.monetab.services.AdressService;
import ci.digitalacademy.monetab.services.dto.AdressDTO;
import ci.digitalacademy.monetab.services.mapper.AdressMapper;
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
    public AdressDTO save(AdressDTO adressDTO) {
        log.debug("Request to save Adress{}", adressDTO);
        Adress adress = AdressMapper.toEntity(adressDTO);
        adress = adressRepository.save(adress);

        return AdressMapper.toDto(adress);
    }

    @Override
    public AdressDTO update(AdressDTO adressDTO) {

        log.debug("Request to update Adress{}", adressDTO);

        return findOne(adressDTO.getId()).map(existingAdress -> {
            existingAdress.setPays(adressDTO.getPays());
            existingAdress.setVille(adressDTO.getVille());
            existingAdress.setRue(adressDTO.getRue());

            return save(existingAdress);
        }).orElseThrow(() -> new IllegalArgumentException());
    }

    @Override
    public Optional<AdressDTO> findOne(Long id) {
        log.debug("Request to findOne Adress{}", id);

        return adressRepository.findById(id).map(adress -> {
            return AdressMapper.toDto(adress);
                });
    }

    @Override
    public List<AdressDTO> findAll() {
        log.debug("Request to findAll Adresses");

        return adressRepository.findAll().stream().map(adress -> {
            return AdressMapper.toDto(adress);
        }).toList();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Adress{}", id);

        adressRepository.deleteById(id);
    }
}
