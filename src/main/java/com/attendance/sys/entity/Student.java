package com.attendance.sys.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name = "student")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    @ManyToOne(optional = false)
    @JoinColumn(name = "unit_id")
    private Unit unit;
    @Column(name = " roll_number")
    private int rollNumber;

}
