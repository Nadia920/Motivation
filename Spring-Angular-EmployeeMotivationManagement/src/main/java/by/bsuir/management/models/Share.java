package by.bsuir.management.models;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name = "shares")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class Share extends BaseEntity{
    @NotNull
    @Column(name = "company_name", length = 15)
    private String companyName;
    @NotNull
    @Column(name = "full_percent", length = 15)
    private double fullPercent;
    @NotNull
    @Column(name = "remaining_number_of_percentaged_of_shares", length = 15)
    private double remainingNumberOfPercentagesOfShares;
    @ManyToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "type_share_mot_id")
    private TypeFinancialMotivation typeFinancialMotivation;

}
