package by.bsuir.management.models;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name = "cryptocurrency")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class Cryptocurrency extends BaseEntity{
    @NotNull
    @Column(name = "coin_name", length = 15)
    private String CoinName;
    @NotNull
    @Column(name = "amount_coins_are_issued", length = 15)
    private double amountCoinsAreIssued;
    @NotNull
    @Column(name = "terms_of_provision", length = 15)
     private String termsOfProvision;
    @ManyToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "type_cryp_mot_id")
    private TypeFinancialMotivation typeFinancialMotivation;

}
