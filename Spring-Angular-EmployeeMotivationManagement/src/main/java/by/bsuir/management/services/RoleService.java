package by.bsuir.management.services;

import by.bsuir.management.models.Employee;
import by.bsuir.management.models.RoleEntity;

import java.util.List;

public interface RoleService {


    List<RoleEntity> findAllRoles();

    RoleEntity findByRole(String role);

    List<Employee> getUsersByRole(String role);
}

