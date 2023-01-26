package alura.spring.boot.api.resources.physician.dto;

import alura.spring.boot.api.resources.address.dto.CreateAddressDto;
import alura.spring.boot.api.resources.enums.Specialty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record CreatePhysicianDto(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String code,
        @NotNull
        Specialty specialty,
        @NotNull
        @Valid
        CreateAddressDto address
) {}
