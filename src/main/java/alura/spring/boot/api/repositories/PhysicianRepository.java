package alura.spring.boot.api.repositories;

import alura.spring.boot.api.entities.physician.Physician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhysicianRepository extends JpaRepository<Physician, Long> {}
