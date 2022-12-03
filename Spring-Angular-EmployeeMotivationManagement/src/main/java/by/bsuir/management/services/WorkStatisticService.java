package by.bsuir.management.services;

import by.bsuir.management.models.WorkStatistic;

import java.util.List;


public interface WorkStatisticService {
    WorkStatistic findById(Long id);
    List<WorkStatistic> findAll();
    WorkStatistic getWorkStatisticsByEmployeeId(Long id);
}
