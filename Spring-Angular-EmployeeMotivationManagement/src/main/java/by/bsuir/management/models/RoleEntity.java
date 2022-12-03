package by.bsuir.management.models;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "app_role")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class RoleEntity extends BaseEntity{

    @Column(name = "role", length = 12)
    String role;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "roleEntity")
    List<Employees> employees;


}

