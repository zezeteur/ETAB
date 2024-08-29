package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;

public class TeacherMapper {

    private TeacherMapper() {
    }

    public static TeacherDTO toDto(Teacher teacher) {
        TeacherDTO teacherDTO = new TeacherDTO();

        teacherDTO.setMatiere(teacher.getMatiere());
        teacherDTO.setVacant(teacher.getVacant());
        return teacherDTO;

    }

    public static Teacher toEntity(TeacherDTO teacherDTO){
        Teacher teacher = new Teacher();

        teacher.setMatiere(teacherDTO.getMatiere());
        teacher.setVacant(teacherDTO.getVacant());

        return teacher;

    }

}
