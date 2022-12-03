package by.bsuir.management.services;

import by.bsuir.management.models.WorkStatistics;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WorkStatisticsService {
    WorkStatistics findById(Long id);
    List<WorkStatistics> findAll();
    WorkStatistics getWorkStatisticsByEmployeeId(Long id);
}
