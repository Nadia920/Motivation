package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.Promotion;
import by.bsuir.management.repository.PromotionRepository;
import by.bsuir.management.services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PromotionServiceImpl implements PromotionService {
    @Autowired
    PromotionRepository promotionRepository;

    @Override
    public Promotion findById(Long id) {
        return promotionRepository.findById(id).get();
    }

    @Override
    public List<Promotion> findAll() {
        return (promotionRepository.findAll());
    }

}
