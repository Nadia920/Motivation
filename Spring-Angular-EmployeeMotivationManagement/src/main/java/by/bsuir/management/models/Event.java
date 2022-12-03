package by.bsuir.management.models;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "event")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class Event extends BaseEntity{
    @NotNull
    @Column(name = "event_name", length = 15)
    private String eventName;
    @NotNull
    @Column(name = "description_of_the_event", length = 15)
    private String descriptionOfTheEvent;
    @NotNull
    @Column(name = "date_of_the_event", length = 15)
    private Date dateOfTheEvent;
    @NotNull
    @Column(name = "program_of_the_event", length = 15)
    private String programOfTheEvent;
    @NotNull
    @Column(name = "budget", length = 15)
    private String budget;
    @ManyToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "type_event_mot_id")
    private TypeFinancialMotivation typeFinancialMotivation;
}
