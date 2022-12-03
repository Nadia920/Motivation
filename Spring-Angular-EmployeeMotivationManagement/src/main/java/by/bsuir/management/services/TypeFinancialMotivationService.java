package by.bsuir.management.services;

import by.bsuir.management.models.TypeFinancialMotivation;

import java.util.List;


public interface TypeFinancialMotivationService {
    TypeFinancialMotivation findById(Long id);

    List<TypeFinancialMotivation> findALL();
}
