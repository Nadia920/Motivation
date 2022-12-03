package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.exception.EditEmployeesParametersExistException;
import by.bsuir.management.models.Employees;
import by.bsuir.management.repository.EmployeesRepository;
import by.bsuir.management.repository.RoleRepository;
import by.bsuir.management.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EmployeesServiceImpl implements EmployeesService {
    @Autowired
    EmployeesRepository employeesRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Employees findById(Long id) {
        return employeesRepository.findById(id).get();
    }

    @Override
    public List<Employees> findAll() {
        return (employeesRepository.findAll());
    }

    @Override
    public boolean save(Employees obj, String role) {
        Long idExistUser = employeesRepository.getIdEmployeesByEmail(obj.getEmail());
        if (idExistUser != null) {
            throw new EditEmployeesParametersExistException("User_with_this_email_already_exist", obj);
        }

        idExistUser = employeesRepository.getIdEmployeesByLogin(obj.getLogin());
        if (idExistUser != null) {
            throw new EditEmployeesParametersExistException("This_login_is_exist", obj);
        }

        Employees employees = new Employees();
        employees.setSurname(obj.getSurname());
        employees.setFirstName(obj.getFirstName());
        employees.setPatronymic(obj.getPatronymic());
        employees.setDateOfBirth(obj.getDateOfBirth());
        employees.setPosition(obj.getPosition());
        employees.setResponsibilities(obj.getResponsibilities());
        employees.setNumberOfPoints(obj.getNumberOfPoints());
        employees.setLogin(obj.getLogin());
        employees.setEmail(obj.getEmail());
        employees.setPassword(obj.getPassword());
        employees.setRoleEntity(roleRepository.findByRole(role));


        employeesRepository.save(employees);

        return true;
    }

    @Override
    public Optional<Employees> findByLogin(String login) {
        return Optional.ofNullable(employeesRepository.findByLogin(login));
    }

    @Override
    public int findNumberOfPointsById(Long id) {
        return employeesRepository.findNumberOfPointsById(id);
    }

}
