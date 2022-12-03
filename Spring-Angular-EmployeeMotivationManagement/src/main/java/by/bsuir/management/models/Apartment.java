package by.bsuir.management.models;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name = "apartments")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class Apartment extends BaseEntity{
 @NotNull
 @Column(name = "address", length = 15)
 private String address;
 @NotNull
 @Column(name = "total_сost", length = 15)
 private double totalCost;
 @NotNull
 @Column(name = "company_payment_percentage", length = 15)
 private double companyPaymentPercentage;
 @NotNull
 @Column(name = "terms_of_provision", length = 15)
 private String termsOfProvision;
 @ManyToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
 @JoinColumn(name = "type_apart_mot_id")
 private TypeFinancialMotivation typeFinancialMotivation;

}
