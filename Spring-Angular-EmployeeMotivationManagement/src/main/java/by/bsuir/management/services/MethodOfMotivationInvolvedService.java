package by.bsuir.management.services;

import by.bsuir.management.models.MethodOfMotivationInvolved;

import java.util.List;

public interface MethodOfMotivationInvolvedService {
    MethodOfMotivationInvolved findById(Long id);
    List<MethodOfMotivationInvolved> findAll();
    boolean save(MethodOfMotivationInvolved obj);
    List<MethodOfMotivationInvolved> getMethodsByEmployeeId(Long id);
}

