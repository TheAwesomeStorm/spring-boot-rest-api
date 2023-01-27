package alura.spring.boot.api.resources.physician.dto;

import alura.spring.boot.api.resources.address.dto.WriteAddressDto;
import jakarta.validation.constraints.NotNull;

public record UpdatePhysicianDto(
        @NotNull
        Long id,
        String name,
        String phoneNumber,
        WriteAddressDto address
) {}
