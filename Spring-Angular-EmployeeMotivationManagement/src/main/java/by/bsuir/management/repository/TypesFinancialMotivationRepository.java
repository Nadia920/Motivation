package by.bsuir.management.repository;

import by.bsuir.management.models.TypesFinancialMotivation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TypesFinancialMotivationRepository extends JpaRepository<TypesFinancialMotivation, Long> {

    Optional<TypesFinancialMotivation> findById(Long id);


    List<TypesFinancialMotivation> findAll();


    void delete(TypesFinancialMotivation typesFinancialMotivation);

    void deleteById(Long id);
}
