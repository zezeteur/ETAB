package ci.digitalacademy.monetab.services.Impl;


import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.repositories.TeacherRepository;
import ci.digitalacademy.monetab.services.TeacherService;
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
    public Teacher save(Teacher teacher) {

        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher update(Teacher teacher) {

        log.debug("Request to update Professeur{}", teacher);

        return null;
    }


    @Override
    public Optional<Teacher> findOne(Long id) {
        log.debug("Request to findOne Professeur{}", id);

        return teacherRepository.findById(id);
    }

    @Override
    public List<Teacher> findAll() {
        log.debug("Request to findAll Professeurs");

        return teacherRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Professeur{}", id);

        teacherRepository.deleteById(id);

    }
    
}
