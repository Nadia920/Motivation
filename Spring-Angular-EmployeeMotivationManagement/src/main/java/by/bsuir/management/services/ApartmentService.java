package by.bsuir.management.services;

import by.bsuir.management.models.Apartment;

import java.util.List;

public interface ApartmentService {
    Apartment findById(Long id);
    List<Apartment> findAll();
}
