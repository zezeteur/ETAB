package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.FicheNote;
import ci.digitalacademy.monetab.repositories.FicheNoteRepository;
import ci.digitalacademy.monetab.services.FicheNoteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class FicheNoteServiceImpl implements FicheNoteService {

    private final FicheNoteRepository ficheNoteRepository;

    @Override
    public FicheNote save(FicheNote ficheNote) {

        return ficheNoteRepository.save(ficheNote);
    }

    @Override
    public FicheNote update(FicheNote ficheNote) {

        log.debug("Request to update FicheNote{}", ficheNote);

        return null;
    }
    

    @Override
    public Optional<FicheNote> findOne(Long id) {
        log.debug("Request to findOne FicheNote{}", id);

        return ficheNoteRepository.findById(id);
    }

    @Override
    public List<FicheNote> findAll() {
        log.debug("Request to findAll FicheNotes");

        return ficheNoteRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete FicheNote{}", id);

        ficheNoteRepository.deleteById(id);

    }


}
