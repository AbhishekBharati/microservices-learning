package com.nodix.departement_service.repository;

import com.nodix.departement_service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findByDepartmentCode(String departmentCode);
}
