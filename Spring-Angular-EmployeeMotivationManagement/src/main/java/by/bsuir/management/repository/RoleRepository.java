package by.bsuir.management.repository;

import by.bsuir.management.models.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    RoleEntity findByRole(String role);

    List<RoleEntity> findAll();


}
