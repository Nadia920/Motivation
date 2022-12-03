package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.WorkStatistics;
import by.bsuir.management.repository.WorkStatisticsRepository;
import by.bsuir.management.services.WorkStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WorkStatisticsServiceImpl implements WorkStatisticsService {
    @Autowired
    WorkStatisticsRepository workStatisticsRepository;

    @Override
    public WorkStatistics findById(Long id) {
        return workStatisticsRepository.findById(id).get();
    }

    @Override
    public List<WorkStatistics> findAll() {
        return (workStatisticsRepository.findAll());
    }

    @Override
    public WorkStatistics getWorkStatisticsByEmployeeId(Long id) {
        return workStatisticsRepository.findByEmployeeId(id);
    }


}
