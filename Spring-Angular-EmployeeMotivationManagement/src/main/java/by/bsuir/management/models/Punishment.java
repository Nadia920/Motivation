package by.bsuir.management.models;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name = "punishment")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class Punishment extends BaseEntity{
    @NotNull
    @Column(name = "misconduct", length = 15)
    private int misconduct;
    @NotNull
    @Column(name = "judgment", length = 15)
    private int judgment;
    @ManyToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
