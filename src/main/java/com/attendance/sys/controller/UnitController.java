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
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Success");

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Error");

        }
    }

    @CrossOrigin
    @GetMapping("getAll")
    public ResponseEntity<?> getAllUnits() {
        try {

            return ResponseEntity.status(HttpStatus.ACCEPTED).body(unitService.getAllUnits());

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Error");

        }
    }
}
