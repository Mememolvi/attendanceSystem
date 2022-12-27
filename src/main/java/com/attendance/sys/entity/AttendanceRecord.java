package com.attendance.sys.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "attendance_record")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(optional = false)
    @JoinColumn(name = "student_id")
    private Student student;
    @Column(name = "date_of_record")
    private LocalDate dateOfRecord;
    @Column(name = "is_present")
    private boolean isPresent;
}
