package by.bsuir.management.services;

import by.bsuir.management.models.TypeNonFinancialMotivation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TypeNonFinancialMotivationService {
    TypeNonFinancialMotivation findById(Long id);

    List<TypeNonFinancialMotivation> findALL();
}
