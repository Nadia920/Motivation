package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.TypeNonFinancialMotivation;
import by.bsuir.management.repository.TypeNonFinancialMotivationRepository;
import by.bsuir.management.services.TypeNonFinancialMotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeNonFinancialMotivationImpl implements TypeNonFinancialMotivationService {
    @Autowired
    TypeNonFinancialMotivationRepository typeNonFinancialMotivationRepository;

    @Override
    public TypeNonFinancialMotivation findById(Long id) {
        return typeNonFinancialMotivationRepository.findById(id).get();
    }


    @Override
    public List<TypeNonFinancialMotivation> findALL() {
        return (typeNonFinancialMotivationRepository.findAll());
    }
}
