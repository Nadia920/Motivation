package by.bsuir.management.models;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "types_nonfin_motivation")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class TypesNonFinancialMotivation extends BaseEntity{
    @NotNull
    @Column(name = "name_nonfin_motivation", length = 15)
    private String nameNonFinMotivation;
    @NotNull
    @Column(name = "description_nonfin_motivation", length = 15)
    private String descriptionNonFinMotivation;
    @NotNull
    @Column(name = "who_can_get_nonfin_motivation", length = 15)
    private String whoCanGetNonFinMotivation;
    @OneToMany(mappedBy = "typesNonFinancialMotivation", fetch = FetchType.EAGER)
    private Set<MethodsOfMotivationInvolved> methodsOfMotivationInvolved;
}
