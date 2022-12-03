package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.Bonus;
import by.bsuir.management.repository.BonusRepository;
import by.bsuir.management.services.BonusService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BonusServiceImpl implements BonusService {
    @Autowired
    BonusRepository bonusRepository;

    @Override
    public Bonus findById(Long id) {
        return bonusRepository.findById(id).get();
    }


    @Override
    public List<Bonus> findALL() {
        return (bonusRepository.findAll());
    }
}
