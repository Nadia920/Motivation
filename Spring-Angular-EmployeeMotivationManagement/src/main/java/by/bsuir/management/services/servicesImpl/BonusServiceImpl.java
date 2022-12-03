package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.Bonus;
import by.bsuir.management.repository.BonusRepository;
import by.bsuir.management.services.BonusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BonusServiceImpl implements BonusService {
    @Autowired
    BonusRepository bonusRepository;

    @Override
    public Bonus findById(Long id) {
        return bonusRepository.findById(id).get();
    }

    @Override
    public List<Bonus> findAll() {
        return (bonusRepository.findAll());
    }
}
