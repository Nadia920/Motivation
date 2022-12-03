package by.bsuir.management.services;

import by.bsuir.management.models.Bonus;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BonusService {
    Bonus findById(Long id);
    List<Bonus> findAll();
}
