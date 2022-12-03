package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.TypeFinancialMotivation;
import by.bsuir.management.repository.TypeFinancialMotivationRepository;
import by.bsuir.management.services.TypeFinancialMotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeFinancialMotivationImpl implements TypeFinancialMotivationService {
    @Autowired
    TypeFinancialMotivationRepository typeFinancialMotivationRepository;

    @Override
    public TypeFinancialMotivation findById(Long id) {
        return typeFinancialMotivationRepository.findById(id).get();
    }

    @Override
    public  List<TypeFinancialMotivation> findALL() {
        return (typeFinancialMotivationRepository.findAll());
    }
}
