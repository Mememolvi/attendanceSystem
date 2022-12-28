package com.attendance.sys.service;

import com.attendance.sys.entity.Unit;
import com.attendance.sys.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitService {

    @Autowired
    private UnitRepository unitRepository;

    public void saveUnit(Unit unit){
        unitRepository.save(unit);
    }

    public List<Unit> getAllUnits(){
        return unitRepository.findAll();
    }


}
