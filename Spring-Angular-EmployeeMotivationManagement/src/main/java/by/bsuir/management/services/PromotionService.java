package by.bsuir.management.services;

import by.bsuir.management.models.Promotion;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PromotionService {
    Promotion findById(Long id);
    List<Promotion> findAll();
}

