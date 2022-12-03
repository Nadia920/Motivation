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
public class TypesFinancialMotivation extends BaseEntity{
    @NotNull
    @Column(name = "value", length = 15)
    private String nameFinMotivation;
    @NotNull
    @Column(name = "value", length = 15)
    private String descriptionFinMotivation;
    @NotNull
    @Column(name = "value", length = 15)
    private String whoCanGetFinMotivation;
    @OneToMany(mappedBy = "typesFinancialMotivation", fetch = FetchType.EAGER)
    private Set<MethodsOfMotivationInvolved> methodsOfMotivationInvolved;
    @OneToMany(mappedBy = "typesFinancialMotivation", fetch = FetchType.EAGER)
    private Set<Apartments> apartments;
    @OneToMany(mappedBy = "typesFinancialMotivation", fetch = FetchType.EAGER)
    private Set<Cryptocurrency> cryptocurrency;
    @OneToMany(mappedBy = "typesFinancialMotivation", fetch = FetchType.EAGER)
    private Set<Bonus> bonus;
    @OneToMany(mappedBy = "typesFinancialMotivation", fetch = FetchType.EAGER)
    private Set<Payments> payments;
}
