package by.bsuir.management.services;

import by.bsuir.management.models.HRManager;

import java.util.List;


public interface HRManagerService {
    HRManager findById(Long id);
    List<HRManager> findAll();
}
