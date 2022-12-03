package by.bsuir.management.services;

import by.bsuir.management.models.HRManagers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HRManagersService {
    HRManagers findById(Long id);
    List<HRManagers> findAll();
}
