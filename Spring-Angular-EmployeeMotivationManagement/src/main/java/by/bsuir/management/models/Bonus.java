package by.bsuir.management.models;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name = "bonus")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class Bonus extends BaseEntity{
    @NotNull
    @Column(name = "bonus_name", length = 15)
    private String bonusName;
    @NotNull
    @Column(name = "bonus_description", length = 15)
    private String bonusDescription;
    @NotNull
    @Column(name = "terms_of_provision", length = 15)
    private String termsOfProvision;
    @ManyToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "bonus_mot_id")
    private TypesFinancialMotivation typesFinancialMotivation;

}

