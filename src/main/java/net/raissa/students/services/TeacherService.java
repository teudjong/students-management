package net.raissa.students.services;

import net.raissa.students.models.entities.Teacher;
import net.raissa.students.repository.TeacherRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {this.teacherRepository = teacherRepository;}

}
