package com.attendance.sys.controller;

import com.attendance.sys.dto.UnitDTO;
import com.attendance.sys.service.UnitService;
import com.attendance.sys.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/attendance-sys")
public class UnitController {

    @Autowired
    UnitService unitService;

    @CrossOrigin
    @PostMapping("/createUnit")
    public ResponseEntity<?> createNewUnit(@RequestBody UnitDTO unitDTO) {
        try {
            unitService.saveUnit(Util.getPopulatedUnit(unitDTO));
            return ResponseEntity.status(HttpStatus.CREATED).body("Success");

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");

        }
    }

    @CrossOrigin
    @GetMapping("/getAll")
    public ResponseEntity<?> getAllUnits() {
        try {

            return ResponseEntity.status(HttpStatus.OK).body(unitService.getAllUnits());

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");

        }
    }

    @CrossOrigin
    @DeleteMapping("/delete/{sectionName}/{grade}")
    public ResponseEntity<?> deleteUnit(@PathVariable String sectionName, @PathVariable int grade) {
        try {

            unitService.deleteBySectionNameAndGrade(sectionName,grade);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(sectionName+" "+grade);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");

        }
    }
}
