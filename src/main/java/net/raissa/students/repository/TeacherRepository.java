package net.raissa.students.repository;

import net.raissa.students.models.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.ArrayList;
import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, String> {

    List<Teacher> teachers = new ArrayList<>();
}
