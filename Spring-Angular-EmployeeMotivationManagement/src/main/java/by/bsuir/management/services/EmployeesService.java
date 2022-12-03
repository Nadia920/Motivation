package by.bsuir.management.services;

import by.bsuir.management.models.Employees;

import java.util.List;
import java.util.Optional;

public interface EmployeesService {
    Employees findById(Long id);
    List<Employees> findAll();

    boolean save(Employees client, String role_user);

    Optional<Employees> findByLogin(String login);

    int findNumberOfPointsById(Long id);

}
