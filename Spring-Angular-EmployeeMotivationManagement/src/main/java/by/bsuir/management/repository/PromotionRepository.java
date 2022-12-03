package by.bsuir.management.repository;

import by.bsuir.management.models.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {
    Optional<Promotion> findById(Long id);


    List<Promotion> findAll();


    void delete(Promotion promotion);

    void deleteById(Long id);
}
