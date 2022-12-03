package by.bsuir.management.repository;

import by.bsuir.management.models.Share;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShareRepository extends JpaRepository<Share, Long> {
    Optional<Share> findById(Long id);


    List<Share> findAll();


    void delete(Share share);

    void deleteById(Long id);
}