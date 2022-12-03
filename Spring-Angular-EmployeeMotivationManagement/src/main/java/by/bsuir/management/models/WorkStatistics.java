package by.bsuir.management.models;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name = "work_statistics")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@DynamicUpdate
public class WorkStatistics extends BaseEntity{
    @NotNull
    @Column(name = "number_of_hours_worked", length = 15)
    private double numberOfHoursWorked;
    @NotNull
    @Column(name = "overtime", length = 15)
    private double overtime;
    @NotNull
    @Column(name = "number_of_closed_projects", length = 15)
    private int numberOfClosedProjects;
    @ManyToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private Employees employees;
}
