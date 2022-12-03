package by.bsuir.management.repository;

import by.bsuir.management.models.TypeNonFinancialMotivation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TypeNonFinancialMotivationRepository extends JpaRepository<TypeNonFinancialMotivation, Long> {
    Optional<TypeNonFinancialMotivation> findById(Long id);


    List<TypeNonFinancialMotivation> findAll();


    void delete(TypeNonFinancialMotivation typeNonFinancialMotivation);

    void deleteById(Long id);
}
