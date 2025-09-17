package com.nodix.departement_service.service.Impl;

import com.nodix.departement_service.dto.DepartmentDto;
import com.nodix.departement_service.entity.Department;
import com.nodix.departement_service.repository.DepartmentRepository;
import com.nodix.departement_service.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto){
        // ConvertDeptDto to DeptJpaEntity
        Department department = new Department(departmentDto.getId(), departmentDto.getDepartmentName(), departmentDto.getDepartmentDescription(), departmentDto.getDepartmentCode());
        Department saveDepartment = departmentRepository.save(department);
        DepartmentDto departmentDto1 = new DepartmentDto(saveDepartment.getId(), saveDepartment.getDepartmentName(), saveDepartment.getDepartmentDescription(), saveDepartment.getDepartmentCode());
        return departmentDto1;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode){
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        DepartmentDto departmentDto = new DepartmentDto(department.getId(), department.getDepartmentName(), department.getDepartmentDescription(), department.getDepartmentCode());
        return departmentDto;
    }
}
