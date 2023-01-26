package alura.spring.boot.api.resources.physician.dto;

import alura.spring.boot.api.resources.address.dto.CreateAddressDto;
import alura.spring.boot.api.resources.enums.Specialty;

public record CreatePhysicianDto(String name, String email, String code, Specialty specialty, CreateAddressDto address) {
}
