package alura.spring.boot.api.resources.physician;

import alura.spring.boot.api.resources.physician.entities.Physician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhysicianRepository extends JpaRepository<Physician, Long> {}
