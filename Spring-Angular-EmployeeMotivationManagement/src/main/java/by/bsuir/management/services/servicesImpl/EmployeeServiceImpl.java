package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.exception.EditEmployeesParametersExistException;
import by.bsuir.management.models.Employee;
import by.bsuir.management.repository.EmployeeRepository;
import by.bsuir.management.repository.RoleRepository;
import by.bsuir.management.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> findAll() {
        return (employeeRepository.findAll());
    }

    @Override
    public boolean save(Employee obj, String role) {
        Long idExistUser = employeeRepository.getIdEmployeesByEmail(obj.getEmail());
        if (idExistUser != null) {
            throw new EditEmployeesParametersExistException("User_with_this_email_already_exist", obj);
        }

        idExistUser = employeeRepository.getIdEmployeesByLogin(obj.getLogin());
        if (idExistUser != null) {
            throw new EditEmployeesParametersExistException("This_login_is_exist", obj);
        }

        Employee employee = new Employee();
        employee.setSurname(obj.getSurname());
        employee.setFirstName(obj.getFirstName());
        employee.setPatronymic(obj.getPatronymic());
        employee.setDateOfBirth(obj.getDateOfBirth());
        employee.setPosition(obj.getPosition());
        employee.setResponsibilities(obj.getResponsibilities());
        employee.setNumberOfPoints(obj.getNumberOfPoints());
        employee.setLogin(obj.getLogin());
        employee.setEmail(obj.getEmail());
        employee.setPassword(obj.getPassword());
        employee.setRoleEntity(roleRepository.findByRole(role));


        employeeRepository.save(employee);

        return true;
    }

    @Override
    public Optional<Employee> findByLogin(String login) {
        return Optional.ofNullable(employeeRepository.findByLogin(login));
    }

    @Override
    public int findNumberOfPointsById(Long id) {
        return employeeRepository.findNumberOfPointsById(id);
    }

}
