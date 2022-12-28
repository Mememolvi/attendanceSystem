package com.attendance.sys.util;

import com.attendance.sys.dto.UnitDTO;
import com.attendance.sys.entity.Unit;

public class Util {
    public static Unit getPopulatedUnit(UnitDTO unitDTO){
        Unit unit = new Unit();
        unit.setGrade(unitDTO.getGrade());
        unit.setSectionName(unitDTO.getSectionName());
        return unit;
    }
}
