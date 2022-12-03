package by.bsuir.management.services;

import by.bsuir.management.models.TypesNonFinancialMotivation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TypesNonFinancialMotivationService {
    TypesNonFinancialMotivation findById(Long id);

    List<TypesNonFinancialMotivation> findALL();
}
