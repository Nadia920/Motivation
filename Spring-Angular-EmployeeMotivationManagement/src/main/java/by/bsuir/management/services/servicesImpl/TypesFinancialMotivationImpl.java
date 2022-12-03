package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.TypesFinancialMotivation;
import by.bsuir.management.repository.TypesFinancialMotivationRepository;
import by.bsuir.management.services.TypesFinancialMotivationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TypesFinancialMotivationImpl implements TypesFinancialMotivationService {
    @Autowired
    TypesFinancialMotivationRepository typesFinancialMotivationRepository;

    @Override
    public TypesFinancialMotivation findById(Long id) {
        return typesFinancialMotivationRepository.findById(id).get();
    }

    @Override
    public  List<TypesFinancialMotivation> findALL() {
        return (typesFinancialMotivationRepository.findAll());
    }
}
