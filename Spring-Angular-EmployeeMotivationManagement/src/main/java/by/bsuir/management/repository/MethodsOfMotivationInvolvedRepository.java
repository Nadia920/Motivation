package by.bsuir.management.repository;

import by.bsuir.management.models.MethodsOfMotivationInvolved;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MethodsOfMotivationInvolvedRepository extends JpaRepository<MethodsOfMotivationInvolved, Long> {
    Optional<MethodsOfMotivationInvolved> findById(Long id);


    List<MethodsOfMotivationInvolved> findAll();


    void delete(MethodsOfMotivationInvolved methodsOfMotivationInvolved);

    void deleteById(Long id);

    List<MethodsOfMotivationInvolved> findAllByEmployeeId(Long id, Sort sort);

}
