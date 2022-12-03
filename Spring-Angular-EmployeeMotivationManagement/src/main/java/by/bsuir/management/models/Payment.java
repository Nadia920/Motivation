package by.bsuir.management.models;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name = "payments")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class Payment extends BaseEntity{
    @NotNull
    @Column(name = "name", length = 15)
    private String paymentsName;
    @NotNull
    @Column(name = "amount", length = 15)
    private double paymentsAmount;
    @ManyToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "type_payments_mot_id")
    private TypeFinancialMotivation typeFinancialMotivation;

}
