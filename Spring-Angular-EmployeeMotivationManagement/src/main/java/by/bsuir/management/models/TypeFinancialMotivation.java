package by.bsuir.management.models;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "types_financial_motivation")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class TypeFinancialMotivation extends BaseEntity{
    @NotNull
    @Column(name = "name_fin_motivation", length = 15)
    private String nameFinMotivation;
    @NotNull
    @Column(name = "description_fin_motivation", length = 15)
    private String descriptionFinMotivation;
    @NotNull
    @Column(name = "who_can_get_fin_motivation", length = 15)
    private String whoCanGetFinMotivation;
    @OneToMany(mappedBy = "typeFinancialMotivation", fetch = FetchType.EAGER)
    private Set<MethodOfMotivationInvolved> methodOfMotivationInvolved;
    @OneToMany(mappedBy = "typeFinancialMotivation", fetch = FetchType.EAGER)
    private Set<Apartment> apartments;
    @OneToMany(mappedBy = "typeFinancialMotivation", fetch = FetchType.EAGER)
    private Set<Cryptocurrency> cryptocurrency;
    @OneToMany(mappedBy = "typeFinancialMotivation", fetch = FetchType.EAGER)
    private Set<Bonus> bonus;
    @OneToMany(mappedBy = "typeFinancialMotivation", fetch = FetchType.EAGER)
    private Set<Payment> payments;
}
