package by.bsuir.management.services;

import by.bsuir.management.models.Apartments;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApartmentsService {
    Apartments findById(Long id);
    List<Apartments> findAll();
}
