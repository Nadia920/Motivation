package by.bsuir.management.models;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "methods_of_motivation_involved")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class MethodOfMotivationInvolved extends BaseEntity{
    @NotNull
    @Column(name = "beforeM", length = 15)
    private String before;
    @NotNull
    @Column(name = "after", length = 15)
    private String after;
    @Column(name = "date_of_recieving", length = 15)
    private Date dateOfRecieving;
    @ManyToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private Employee employee;
    @ManyToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "who_control_id")
    private HRManager hrManager;
    @ManyToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "types_nonfin_mot_id")
    private TypeNonFinancialMotivation typeNonFinancialMotivation;
    @ManyToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "types_fin_mot_id")
    private TypeFinancialMotivation typeFinancialMotivation;
}
