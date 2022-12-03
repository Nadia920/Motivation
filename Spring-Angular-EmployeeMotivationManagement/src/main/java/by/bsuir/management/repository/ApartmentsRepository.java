package by.bsuir.management.repository;

import by.bsuir.management.models.Apartments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApartmentsRepository extends JpaRepository<Apartments, Long> {
    Optional<Apartments> findById(Long id);


    List<Apartments> findAll();


    void delete(Apartments apartments);

    void deleteById(Long id);
}
