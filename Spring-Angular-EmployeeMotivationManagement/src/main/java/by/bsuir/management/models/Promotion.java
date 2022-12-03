package by.bsuir.management.models;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name = "promotion")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class Promotion extends BaseEntity{
    @NotNull
    @Column(name = "title_of_the_position", length = 15)
    private String titleOfThePosition;
    @NotNull
    @Column(name = "number_of_points_required", length = 15)
    private int numberOfPointsRequired;
}
