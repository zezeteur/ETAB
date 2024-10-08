package ci.digitalacademy.monetab.services.Impl;


import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.repositories.StudentRepository;
import ci.digitalacademy.monetab.services.StudentService;
import ci.digitalacademy.monetab.services.dto.StudentDTO;
import ci.digitalacademy.monetab.services.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public StudentDTO save(StudentDTO studentDTO) {
        log.debug("Request to save Student{}", studentDTO);
        Student student = StudentMapper.toEntity(studentDTO);
        student = studentRepository.save(student);

        return StudentMapper.toDto(student);
    }

    @Override
    public StudentDTO update(StudentDTO studentDTO) {

        log.debug("Request to update Student{}", studentDTO);

        return findOne(studentDTO.getId()).map(existingStudent -> {

            existingStudent.setNom(studentDTO.getNom());
            existingStudent.setPrenom(studentDTO.getPrenom());
            existingStudent.setGenre(studentDTO.getGenre());
            existingStudent.setDateNaissance(studentDTO.getDateNaissance());
            existingStudent.setEmail(studentDTO.getEmail());
            existingStudent.setTelephone(studentDTO.getTelephone());
            existingStudent.setMatricule(studentDTO.getMatricule());
            existingStudent.setClasse(studentDTO.getClasse());

            return save(existingStudent);
        }).orElseThrow(() -> new IllegalArgumentException());
    }

    @Override
    public Optional<StudentDTO> findOne(Long id) {
        log.debug("Request to findOne Student{}", id);

        return studentRepository.findById(id).map(student -> {
            return StudentMapper.toDto(student);
        });
    }

    @Override
    public List<StudentDTO> findAll() {
        log.debug("Request to findAll Studentes");

        return studentRepository.findAll().stream().map(student -> {
            return StudentMapper.toDto(student);
        }).toList();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Student{}", id);

        studentRepository.deleteById(id);
    }
}
