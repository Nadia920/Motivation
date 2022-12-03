package by.bsuir.management.repository;

import by.bsuir.management.models.MethodOfMotivationInvolved;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MethodOfMotivationInvolvedRepository extends JpaRepository<MethodOfMotivationInvolved, Long> {
    Optional<MethodOfMotivationInvolved> findById(Long id);


    List<MethodOfMotivationInvolved> findAll();


    void delete(MethodOfMotivationInvolved methodOfMotivationInvolved);

    void deleteById(Long id);

    List<MethodOfMotivationInvolved> findAllByEmployeeId(Long id, Sort sort);

}
