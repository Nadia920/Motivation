package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.MethodsOfMotivationInvolved;
import by.bsuir.management.repository.MethodsOfMotivationInvolvedRepository;
import by.bsuir.management.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.List;

public class MethodsOfMotivationInvolvedServiceImpl implements MethodsOfMotivationInvolvedService {
    @Autowired
    MethodsOfMotivationInvolvedRepository methodsOfMotivationInvolvedRepository;
    @Autowired
    EmployeesService employeesService;
    @Autowired
    HRManagersService hrManagersService;
    @Autowired
    TypesNonFinancialMotivationService typesNonFinancialMotivationService;
    @Autowired
    TypesFinancialMotivationService typesFinancialMotivationService;


    @Override
    public MethodsOfMotivationInvolved findById(Long id) {
        return methodsOfMotivationInvolvedRepository.findById(id).get();
    }

    @Override
    public List<MethodsOfMotivationInvolved> findAll() {
        return (methodsOfMotivationInvolvedRepository.findAll());
    }

    @Override
    public boolean save(MethodsOfMotivationInvolved obj) {
        obj.setEmployees(employeesService.findById(obj.getEmployees().getId()));
        obj.setHrManagers(hrManagersService.findById(obj.getHrManagers().getId()));
        obj.setTypesNonFinancialMotivation(typesNonFinancialMotivationService.findById(obj.getTypesNonFinancialMotivation().getId()));
        obj.setTypesFinancialMotivation(typesFinancialMotivationService.findById(obj.getTypesFinancialMotivation().getId()));
        MethodsOfMotivationInvolved a = methodsOfMotivationInvolvedRepository.save(obj);
        if (a == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public List<MethodsOfMotivationInvolved> getMethodsByEmployeeId(Long id) {
        return methodsOfMotivationInvolvedRepository.findAllByEmployeeId(id, Sort.by("date_of_recieving").ascending());
    }

}
