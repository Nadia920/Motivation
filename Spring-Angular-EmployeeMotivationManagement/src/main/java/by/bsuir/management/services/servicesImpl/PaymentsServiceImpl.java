package by.bsuir.management.services.servicesImpl;

import by.bsuir.management.models.Payments;
import by.bsuir.management.repository.PaymentsRepository;
import by.bsuir.management.services.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PaymentsServiceImpl implements PaymentsService {
    @Autowired
    PaymentsRepository paymentsRepository;

    @Override
    public Payments findById(Long id) {
        return paymentsRepository.findById(id).get();
    }

    @Override
    public List<Payments> findAll() {
        return (paymentsRepository.findAll());
    }

}
