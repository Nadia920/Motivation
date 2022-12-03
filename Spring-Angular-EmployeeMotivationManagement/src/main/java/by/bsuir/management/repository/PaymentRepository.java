package by.bsuir.management.repository;

import by.bsuir.management.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findById(Long id);


    List<Payment> findAll();


    void delete(Payment payment);

    void deleteById(Long id);
}
