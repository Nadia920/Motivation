package by.bsuir.management.models;

import lombok.*;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
@Data
@DynamicUpdate
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    public BaseEntity(Long id) {
        this.id =id;
    }

    public BaseEntity() {
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseEntity{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }

}
