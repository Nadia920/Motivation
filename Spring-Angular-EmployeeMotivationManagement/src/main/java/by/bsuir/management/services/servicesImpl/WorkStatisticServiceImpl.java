package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.WorkStatistic;
import by.bsuir.management.repository.WorkStatisticRepository;
import by.bsuir.management.services.WorkStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkStatisticServiceImpl implements WorkStatisticService {
    @Autowired
    WorkStatisticRepository workStatisticRepository;

    @Override
    public WorkStatistic findById(Long id) {
        return workStatisticRepository.findById(id).get();
    }

    @Override
    public List<WorkStatistic> findAll() {
        return (workStatisticRepository.findAll());
    }

    @Override
    public WorkStatistic getWorkStatisticsByEmployeeId(Long id) {
        return workStatisticRepository.findByEmployeeId(id);
    }


}
