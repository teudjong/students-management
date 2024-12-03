package net.raissa.students.models.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Teacher {

    @Column(unique = true)
    @Id
    private  String id;

    private  String name;

    private  String email;

    private  String department;

    public void add(Teacher teacher) {
    }
}
