package by.bsuir.management.repository;

import by.bsuir.management.models.Bonus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BonusRepository extends JpaRepository<Bonus, Long> {
    Optional<Bonus> findById(Long id);


    List<Bonus> findAll();


    void delete(Bonus bonus);

    void deleteById(Long id);
}

