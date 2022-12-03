package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.HRManager;
import by.bsuir.management.repository.HRManagerRepository;
import by.bsuir.management.services.HRManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HRManagerServiceImpl implements HRManagerService {
    @Autowired
    HRManagerRepository hrManagerRepository;

    @Override
    public HRManager findById(Long id) {
        return hrManagerRepository.findById(id).get();
    }

    @Override
    public List<HRManager> findAll() {
        return (hrManagerRepository.findAll());
    }
}
