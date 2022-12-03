package by.bsuir.management.repository;

import by.bsuir.management.models.Shares;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SharesRepository extends JpaRepository<Shares, Long> {
    Optional<Shares> findById(Long id);


    List<Shares> findAll();


    void delete(Shares shares);

    void deleteById(Long id);
}