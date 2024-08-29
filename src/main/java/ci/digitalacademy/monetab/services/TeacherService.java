package ci.digitalacademy.monetab.services;


import ci.digitalacademy.monetab.services.dto.TeacherDTO;
import java.util.List;
import java.util.Optional;

public interface TeacherService {

    TeacherDTO save(TeacherDTO user);

    TeacherDTO update(TeacherDTO user);

    Optional<TeacherDTO> findOne(Long id);

    List<TeacherDTO> findAll();

    void delete(Long id);

}
