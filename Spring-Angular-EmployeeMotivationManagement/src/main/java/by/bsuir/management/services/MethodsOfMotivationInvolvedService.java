package by.bsuir.management.services;

import by.bsuir.management.models.MethodsOfMotivationInvolved;

import java.util.List;

public interface MethodsOfMotivationInvolvedService {
    MethodsOfMotivationInvolved findById(Long id);
    List<MethodsOfMotivationInvolved> findAll();
    boolean save(MethodsOfMotivationInvolved obj);
    List<MethodsOfMotivationInvolved> getMethodsByEmployeeId(Long id);
}

