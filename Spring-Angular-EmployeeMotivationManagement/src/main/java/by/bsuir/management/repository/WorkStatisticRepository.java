package by.bsuir.management.repository;

import by.bsuir.management.models.WorkStatistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WorkStatisticRepository extends JpaRepository<WorkStatistic, Long> {
    Optional<WorkStatistic> findById(Long id);


    List<WorkStatistic> findAll();


    void delete(WorkStatistic workStatistic);

    void deleteById(Long id);

    WorkStatistic findByEmployeeId(Long id);
}