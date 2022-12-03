package by.bsuir.management.repository;

import by.bsuir.management.models.Punishment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PunishmentRepository extends JpaRepository<Punishment, Long> {
    Optional<Punishment> findById(Long id);


    List<Punishment> findAll();


    void delete(Punishment punishment);

    void deleteById(Long id);
}