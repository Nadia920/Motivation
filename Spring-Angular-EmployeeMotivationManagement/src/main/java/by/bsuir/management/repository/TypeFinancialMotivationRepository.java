package by.bsuir.management.repository;

import by.bsuir.management.models.TypeFinancialMotivation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TypeFinancialMotivationRepository extends JpaRepository<TypeFinancialMotivation, Long> {

    Optional<TypeFinancialMotivation> findById(Long id);


    List<TypeFinancialMotivation> findAll();


    void delete(TypeFinancialMotivation typeFinancialMotivation);

    void deleteById(Long id);
}
