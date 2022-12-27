package com.attendance.sys.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name = "unit")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "section_name")
    private String section_name;
    private int grade;
}