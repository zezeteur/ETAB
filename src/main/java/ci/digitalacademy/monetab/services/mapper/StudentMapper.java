package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.services.dto.StudentDTO;

public class StudentMapper {

    private StudentMapper() {
    }

    public static StudentDTO toDto(Student student) {
        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setMatricule(student.getMatricule());
        studentDTO.setClasse(student.getClasse());

        return studentDTO;

    }

    public static Student toEntity(StudentDTO studentDTO){
        Student student = new Student();

        student.setMatricule(studentDTO.getMatricule());
        student.setClasse(studentDTO.getClasse());

        return student;

    }

}
