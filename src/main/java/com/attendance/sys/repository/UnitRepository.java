package com.attendance.sys.repository;

import com.attendance.sys.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Integer> {
    @Transactional
    long deleteBySectionNameAndGrade(String sectionName, int Grade);
}
