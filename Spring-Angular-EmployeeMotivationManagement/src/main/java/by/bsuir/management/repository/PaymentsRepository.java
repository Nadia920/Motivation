package by.bsuir.management.repository;

import by.bsuir.management.models.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentsRepository extends JpaRepository<Payments, Long> {
    Optional<Payments> findById(Long id);


    List<Payments> findAll();


    void delete(Payments payments);

    void deleteById(Long id);
}
