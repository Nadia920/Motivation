package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.TypesNonFinancialMotivation;
import by.bsuir.management.repository.TypesNonFinancialMotivationRepository;
import by.bsuir.management.services.TypesNonFinancialMotivationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TypesNonFinancialMotivationImpl implements TypesNonFinancialMotivationService {
    @Autowired
    TypesNonFinancialMotivationRepository typesNonFinancialMotivationRepository;

    @Override
    public TypesNonFinancialMotivation findById(Long id) {
        return typesNonFinancialMotivationRepository.findById(id).get();
    }


    @Override
    public List<TypesNonFinancialMotivation> findALL() {
        return (typesNonFinancialMotivationRepository.findAll());
    }
}
