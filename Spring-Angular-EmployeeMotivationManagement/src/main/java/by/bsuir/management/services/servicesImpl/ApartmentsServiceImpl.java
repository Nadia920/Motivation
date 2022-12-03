package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.Apartments;
import by.bsuir.management.repository.ApartmentsRepository;
import by.bsuir.management.services.ApartmentsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ApartmentsServiceImpl implements ApartmentsService {
    @Autowired
    ApartmentsRepository apartmentsRepository;

    @Override
    public Apartments findById(Long id) {
        return apartmentsRepository.findById(id).get();
    }

    @Override
    public List<Apartments> findAll() {
        return (apartmentsRepository.findAll());
    }

}
