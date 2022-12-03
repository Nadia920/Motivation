package by.bsuir.management.services;

import by.bsuir.management.models.Payment;

import java.util.List;


public interface PaymentService {
    Payment findById(Long id);
    List<Payment> findAll();
}
