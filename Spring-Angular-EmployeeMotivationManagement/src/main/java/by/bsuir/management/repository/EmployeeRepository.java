package by.bsuir.management.repository;

import by.bsuir.management.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findById(Long id);


    List<Employee> findAll();


    void delete(Employee employee);

    void deleteById(Long id);

    Employee findByLogin(String login);

    @Query(value = "SELECT e.id FROM Employee e WHERE e.login = ?1")
    Long getIdEmployeesByLogin(String login);

    @Query(value = "SELECT e.id FROM Employee e WHERE e.email = ?1")
    Long getIdEmployeesByEmail(String email);


    @Query(value = "SELECT e.numberOfPoints FROM Employee e WHERE e.id = ?1")
    int findNumberOfPointsById(Long id);
}
