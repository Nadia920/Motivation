package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.Employee;
import by.bsuir.management.models.RoleEntity;
import by.bsuir.management.repository.RoleRepository;
import by.bsuir.management.services.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleEntity> findAllRoles() {
        List<RoleEntity> rolesEntity = roleRepository.findAll();
        return rolesEntity;
    }

    @Override
    public RoleEntity findByRole(String role) {
        return roleRepository.findByRole(role);
    }

    @Override
    public List<Employee> getUsersByRole(String role) {
        RoleEntity roleEntity = roleRepository.findByRole(role);
        List<Employee> employees = roleEntity.getEmployees();
        return employees;
    }
}
