package com.attendance.sys.controller;

import com.attendance.sys.entity.Unit;
import com.attendance.sys.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendance-sys")
public class UnitController {

    @Autowired
    UnitService unitService;

    @CrossOrigin
    @PostMapping("/create-unit")
    public ResponseEntity<?> createNewUnit() {
        Unit unit = Unit.builder().grade(1).section_name("Green").build();
        unitService.saveUnit(unit);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Success");
    }
}
