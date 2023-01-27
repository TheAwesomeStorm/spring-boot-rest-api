package alura.spring.boot.api.resources.patient.dto;

import alura.spring.boot.api.resources.address.dto.WriteAddressDto;

public record CreatePatientDto(String name, String email, String phoneNumber, String socialNumber, WriteAddressDto address) {
}
