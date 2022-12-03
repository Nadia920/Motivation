package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.HRManagers;
import by.bsuir.management.repository.HRManagersRepository;
import by.bsuir.management.services.HRManagersService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HRManagersServiceImpl implements HRManagersService {
    @Autowired
    HRManagersRepository hrManagersRepository;

    @Override
    public HRManagers findById(Long id) {
        return hrManagersRepository.findById(id).get();
    }

    @Override
    public List<HRManagers> findAll() {
        return (hrManagersRepository.findAll());
    }
}
