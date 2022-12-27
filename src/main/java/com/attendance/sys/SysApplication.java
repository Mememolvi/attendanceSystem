package com.attendance.sys;

import com.attendance.sys.entity.Unit;
import com.attendance.sys.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SysApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysApplication.class, args);
	}

}
