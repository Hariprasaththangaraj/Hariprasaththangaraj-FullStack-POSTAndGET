package com.hariprasathcodes.studentapplication.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String address;
}
