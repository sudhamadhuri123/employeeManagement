package org.example.employeemanagement.employeerepo;


import org.example.employeemanagement.employeeentity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
