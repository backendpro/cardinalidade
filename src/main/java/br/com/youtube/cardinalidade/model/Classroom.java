package br.com.youtube.cardinalidade.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_classroom")
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @OneToOne(mappedBy = "classroom")
    private Student student;
}
