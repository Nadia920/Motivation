package by.bsuir.management.services;

import by.bsuir.management.models.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee findById(Long id);
    List<Employee> findAll();

    boolean save(Employee client, String role_user);

    Optional<Employee> findByLogin(String login);

    int findNumberOfPointsById(Long id);

}
