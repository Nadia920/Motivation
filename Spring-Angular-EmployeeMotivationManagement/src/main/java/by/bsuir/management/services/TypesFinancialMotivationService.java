package by.bsuir.management.services;

import by.bsuir.management.models.TypesFinancialMotivation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TypesFinancialMotivationService {
    TypesFinancialMotivation findById(Long id);

    List<TypesFinancialMotivation> findALL();
}
