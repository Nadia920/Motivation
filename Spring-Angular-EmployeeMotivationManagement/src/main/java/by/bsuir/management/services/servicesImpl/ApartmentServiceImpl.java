package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.Apartment;
import by.bsuir.management.repository.ApartmentRepository;
import by.bsuir.management.services.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentServiceImpl implements ApartmentService {
    @Autowired
    ApartmentRepository apartmentRepository;

    @Override
    public Apartment findById(Long id) {
        return apartmentRepository.findById(id).get();
    }

    @Override
    public List<Apartment> findAll() {
        return (apartmentRepository.findAll());
    }

}
