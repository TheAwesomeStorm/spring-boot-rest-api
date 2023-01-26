package alura.spring.boot.api.dto.physician;

import alura.spring.boot.api.dto.address.CreateAddressDto;
import alura.spring.boot.api.enums.Specialty;

public record CreatePhysicianDto(String name, String email, String code, Specialty specialty, CreateAddressDto address) {
}
