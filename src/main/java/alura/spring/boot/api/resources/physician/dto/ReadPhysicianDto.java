package alura.spring.boot.api.resources.physician.dto;

import alura.spring.boot.api.resources.physician.enums.Specialty;
import alura.spring.boot.api.resources.physician.entities.Physician;

public record ReadPhysicianDto(
        Long id,
        String name,
        String email,
        String code,
        Specialty specialty
) {
    public ReadPhysicianDto(Physician physician) {
        this(
                physician.getId(),
                physician.getName(),
                physician.getEmail(),
                physician.getCode(),
                physician.getSpecialty()
        );
    }
}
