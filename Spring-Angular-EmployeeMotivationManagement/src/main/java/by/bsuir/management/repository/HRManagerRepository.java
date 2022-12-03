package by.bsuir.management.repository;

import by.bsuir.management.models.HRManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HRManagerRepository extends JpaRepository<HRManager, Long> {

    Optional<HRManager> findById(Long id);


    List<HRManager> findAll();


    void delete(HRManager hrManager);

    void deleteById(Long id);
}
