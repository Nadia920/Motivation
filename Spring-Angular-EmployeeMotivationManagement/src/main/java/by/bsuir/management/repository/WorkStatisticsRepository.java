package by.bsuir.management.repository;

import by.bsuir.management.models.WorkStatistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WorkStatisticsRepository extends JpaRepository<WorkStatistics, Long> {
    Optional<WorkStatistics> findById(Long id);


    List<WorkStatistics> findAll();


    void delete(WorkStatistics workStatistics);

    void deleteById(Long id);

    WorkStatistics findByEmployeeId(Long id);
}