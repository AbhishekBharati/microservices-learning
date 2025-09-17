package com.nodix.employeeservice.service;

import com.nodix.employeeservice.dto.APIResponseDto;
import com.nodix.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployee(Long employeeId);
}

