package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.repositories.TeacherRepository;
import ci.digitalacademy.monetab.services.TeacherService;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;
import ci.digitalacademy.monetab.services.mapper.TeacherMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    @Override
    public TeacherDTO save(TeacherDTO teacherDTO) {
        log.debug("Request to save Teacher{}", teacherDTO);
        Teacher teacher = TeacherMapper.toEntity(teacherDTO);
        teacher = teacherRepository.save(teacher);

        return TeacherMapper.toDto(teacher);
    }

    @Override
    public TeacherDTO update(TeacherDTO teacherDTO) {

        log.debug("Request to update Teacher{}", teacherDTO);

        return findOne(teacherDTO.getId()).map(existingTeacher -> {

            existingTeacher.setNom(teacherDTO.getNom());
            existingTeacher.setPrenom(teacherDTO.getPrenom());
            existingTeacher.setGenre(teacherDTO.getGenre());
            existingTeacher.setDateNaissance(teacherDTO.getDateNaissance());
            existingTeacher.setEmail(teacherDTO.getEmail());
            existingTeacher.setTelephone(teacherDTO.getTelephone());

            existingTeacher.setMatiere(teacherDTO.getMatiere());
            existingTeacher.setVacant(teacherDTO.getVacant());

            return save(existingTeacher);
        }).orElseThrow(() -> new IllegalArgumentException());
    }

    @Override
    public Optional<TeacherDTO> findOne(Long id) {
        log.debug("Request to findOne Teacher{}", id);

        return teacherRepository.findById(id).map(teacher -> {
            return TeacherMapper.toDto(teacher);
        });
    }

    @Override
    public List<TeacherDTO> findAll() {
        log.debug("Request to findAll Teacheres");

        return teacherRepository.findAll().stream().map(teacher -> {
            return TeacherMapper.toDto(teacher);
        }).toList();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Teacher{}", id);

        teacherRepository.deleteById(id);
    }
}
