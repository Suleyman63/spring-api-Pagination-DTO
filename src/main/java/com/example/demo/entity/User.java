package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User extends BaseEntity{

    @Id
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_gen",initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @Column(name = "ID")
    private Long id;
    @Column(name = "FIRSTNAME",length = 100)
    private String firstname;
    @Column(name = "LASTNAME", length = 100)
    private String lastname;
    @Column(name = "AGE", length = 3)
    private Integer age;
}
