package by.bsuir.management.services;

import by.bsuir.management.models.Employees;
import by.bsuir.management.models.RoleEntity;

import java.util.List;

public interface RoleService {


    List<RoleEntity> findAllRoles();

    RoleEntity findByRole(String role);

    List<Employees> getUsersByRole(String role);
}

