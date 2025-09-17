package com.nodix.employeeservice.controller;

import com.nodix.employeeservice.dto.APIResponseDto;
import com.nodix.employeeservice.dto.EmployeeDto;
import com.nodix.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getEmployee(@PathVariable("id") Long employeeId){
        return  new ResponseEntity<>(employeeService.getEmployee(employeeId), HttpStatus.OK);
    }

//    Build save Empoloyee Rest API
    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        return new ResponseEntity<>(employeeService.saveEmployee(employeeDto), HttpStatus.CREATED);
    }
}
