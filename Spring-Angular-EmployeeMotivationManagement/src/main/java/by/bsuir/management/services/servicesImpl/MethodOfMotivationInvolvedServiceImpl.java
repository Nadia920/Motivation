package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.MethodOfMotivationInvolved;
import by.bsuir.management.repository.MethodOfMotivationInvolvedRepository;
import by.bsuir.management.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MethodOfMotivationInvolvedServiceImpl implements MethodOfMotivationInvolvedService {
    @Autowired
    private MethodOfMotivationInvolvedRepository methodOfMotivationInvolvedRepository;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private HRManagerService hrManagerService;
    @Autowired
    private TypeNonFinancialMotivationService typeNonFinancialMotivationService;
    @Autowired
    private TypeFinancialMotivationService typeFinancialMotivationService;


    @Override
    public MethodOfMotivationInvolved findById(Long id) {
        return methodOfMotivationInvolvedRepository.findById(id).get();
    }

    @Override
    public List<MethodOfMotivationInvolved> findAll() {
        return (methodOfMotivationInvolvedRepository.findAll());
    }

    @Override
    public boolean save(MethodOfMotivationInvolved obj) {
        obj.setEmployee(employeeService.findById(obj.getEmployee().getId()));
        obj.setHrManager(hrManagerService.findById(obj.getHrManager().getId()));
        obj.setTypeNonFinancialMotivation(typeNonFinancialMotivationService.findById(obj.getTypeNonFinancialMotivation().getId()));
        obj.setTypeFinancialMotivation(typeFinancialMotivationService.findById(obj.getTypeFinancialMotivation().getId()));
        MethodOfMotivationInvolved a = methodOfMotivationInvolvedRepository.save(obj);
        if (a == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public List<MethodOfMotivationInvolved> getMethodsByEmployeeId(Long id) {
        return methodOfMotivationInvolvedRepository.findAllByEmployeeId(id, Sort.by("date_of_recieving").ascending());
    }

}
