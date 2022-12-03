package by.bsuir.management.repository;

import by.bsuir.management.models.HRManagers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HRManagersRepository extends JpaRepository<HRManagers, Long> {

    Optional<HRManagers> findById(Long id);


    List<HRManagers> findAll();


    void delete(HRManagers hrManagers);

    void deleteById(Long id);
}
