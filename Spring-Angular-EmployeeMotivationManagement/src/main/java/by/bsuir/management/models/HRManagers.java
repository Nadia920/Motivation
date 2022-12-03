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
@Table(name = "hr_managers")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class HRManagers extends BaseEntity{
    @NotNull
    @Column(name = "HR_surname", length = 15)
    private String HRSurname;
    @NotNull
    @Column(name = "HR_first_name", length = 15)
    private String HRFirstname;
    @NotNull
    @Column(name = "HR_patronymic", length = 15)
    private String HRPatronymic;
    @NotNull
    @Column(name = "HR_date_of_birth", length = 15)
    private Date HRDateOfBirth;
    @NotNull
    @Column(name = "HR_position", length = 15)
    private String HRPosition;
    @NotNull
    @Column(name = "HR_ responsibilities", length = 15)
    private String HReRsponsibilities;
    @OneToMany(mappedBy = "hrManagers", fetch = FetchType.EAGER)
    private Set<MethodsOfMotivationInvolved> methodsOfMotivationInvolved;
}
