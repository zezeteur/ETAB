package ci.digitalacademy.monetab.services.Impl;


import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.repositories.StudentRepository;
import ci.digitalacademy.monetab.services.StudentService;
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
    public Student save(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {

        log.debug("Request to update Eleve{}", student);

        return null;
    }


    @Override
    public Optional<Student> findOne(Long id) {
        log.debug("Request to findOne Eleve{}", id);

        return studentRepository.findById(id);
    }

    @Override
    public List<Student> findAll() {
        log.debug("Request to findAll Eleves");

        return studentRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Eleve{}", id);

        studentRepository.deleteById(id);

    }
    
}
