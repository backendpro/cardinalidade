package br.com.youtube.cardinalidade.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @ManyToMany(mappedBy = "teachers")
    private List<Student> students;

}
