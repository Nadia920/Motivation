package by.bsuir.management.repository;

import by.bsuir.management.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    Optional<Event> findById(Long id);


    List<Event> findAll();


    void delete(Event event);

    void deleteById(Long id);
}

