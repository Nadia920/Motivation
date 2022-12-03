package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.Payment;
import by.bsuir.management.repository.PaymentRepository;
import by.bsuir.management.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public Payment findById(Long id) {
        return paymentRepository.findById(id).get();
    }

    @Override
    public List<Payment> findAll() {
        return (paymentRepository.findAll());
    }

}
