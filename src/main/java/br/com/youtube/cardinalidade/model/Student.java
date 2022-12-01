package br.com.youtube.cardinalidade.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_classroom", referencedColumnName = "id")
    private Classroom classroom;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Homework> homeworks;

    @ManyToMany
    @JoinTable(name = "teacher_students",
            joinColumns =
            @JoinColumn(name = "id_student", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "id_teacher", referencedColumnName = "id"))
    private List<Teacher> teachers;

}
