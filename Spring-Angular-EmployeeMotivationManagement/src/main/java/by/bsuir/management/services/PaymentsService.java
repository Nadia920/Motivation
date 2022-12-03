package by.bsuir.management.services;

import by.bsuir.management.models.Payments;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaymentsService {
    Payments findById(Long id);
    List<Payments> findAll();
}
