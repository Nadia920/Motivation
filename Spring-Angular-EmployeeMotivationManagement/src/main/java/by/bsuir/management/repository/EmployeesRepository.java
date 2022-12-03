package by.bsuir.management.repository;

import by.bsuir.management.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {
    Optional<Employees> findById(Long id);


    List<Employees> findAll();


    void delete(Employees employees);

    void deleteById(Long id);

    Employees findByLogin(String login);

    @Query(value = "SELECT e.id FROM Employees e WHERE e.login = ?1")
    Long getIdEmployeesByLogin(String login);

    @Query(value = "SELECT e.id FROM Employees e WHERE e.email = ?1")
    Long getIdEmployeesByEmail(String email);


    @Query(value = "SELECT e.numberOfPoints FROM Employees e WHERE e.id = ?1")
    int findNumberOfPointsById(Long id);
}