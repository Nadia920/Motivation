package by.bsuir.management.models;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "employees")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class Employees extends BaseEntity{
    @NotNull
    @Column(name = "surname", length = 15)
    private String surname;
    @NotNull
    @Column(name = "first_name", length = 15)
    private String firstName;
    @NotNull
    @Column(name = "patronymic", length = 15)
    private String patronymic;
    @NotNull
    @Column(name = "date_of_birth", length = 15)
    private Date dateOfBirth;
    @NotNull
    @Column(name = "position", length = 15)
    private String position;
    @NotNull
    @Column(name = "responsibilities", length = 15)
    private String responsibilities;
    @NotNull
    @Column(name = "number_of_points", length = 15)
    private int numberOfPoints;
    @NotNull
    @Column(name = "login", length = 15)
    private String login;
    @NotNull
    @Column(name = "password", length = 15)
    private String password;
    @NotNull
    @Column(name = "email", length = 40)
    private String email;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private RoleEntity roleEntity;
    @OneToMany(mappedBy = "employees", fetch = FetchType.EAGER)
    private Set<MethodsOfMotivationInvolved> methodsOfMotivationInvolved;
    @OneToMany(mappedBy = "employees", fetch = FetchType.EAGER)
    private Set<WorkStatistics> workStatistics;
    @OneToMany(mappedBy = "employees", fetch = FetchType.EAGER)
    private Set<Punishment> punishments;

    public Employees(Employees employee) {
        this.setId(employee.getId());
        this.login = employee.getLogin();
        this.password = employee.getPassword();
        this.roleEntity = employee.getRoleEntity();
        this.surname = employee.getSurname();
        this.firstName = employee.getFirstName();
        this.patronymic = employee.getPatronymic();
        this.dateOfBirth = employee.getDateOfBirth();
        this.position = employee.getPosition();
        this.responsibilities = employee.getResponsibilities();
        this.numberOfPoints = employee.getNumberOfPoints();
    }
}
