package by.bsuir.management.repository;

import by.bsuir.management.models.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
    Optional<Apartment> findById(Long id);


    List<Apartment> findAll();


    void delete(Apartment apartment);

    void deleteById(Long id);
}
