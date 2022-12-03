package by.bsuir.management.repository;

import by.bsuir.management.models.TypesNonFinancialMotivation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TypesNonFinancialMotivationRepository extends JpaRepository<TypesNonFinancialMotivation, Long> {
    Optional<TypesNonFinancialMotivation> findById(Long id);


    List<TypesNonFinancialMotivation> findAll();


    void delete(TypesNonFinancialMotivation typesNonFinancialMotivation);

    void deleteById(Long id);
}
