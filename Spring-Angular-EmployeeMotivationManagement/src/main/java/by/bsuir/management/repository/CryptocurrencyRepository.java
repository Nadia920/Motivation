package by.bsuir.management.repository;

import by.bsuir.management.models.Cryptocurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CryptocurrencyRepository  extends JpaRepository<Cryptocurrency, Long> {
    Optional<Cryptocurrency> findById(Long id);


    List<Cryptocurrency> findAll();


    void delete(Cryptocurrency cryptocurrency);

    void deleteById(Long id);
}
