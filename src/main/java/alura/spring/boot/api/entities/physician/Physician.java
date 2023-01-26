package alura.spring.boot.api.entities.physician;

import alura.spring.boot.api.entities.address.Address;
import alura.spring.boot.api.enums.Specialty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import java.util.Objects;

@Table(name="physicians")
@Entity(name="Physician")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Physician {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String code;
    @Enumerated(EnumType.STRING)
    private Specialty specialty;
    @Embedded
    private Address address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Physician physician = (Physician) o;
        return id != null && Objects.equals(id, physician.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
