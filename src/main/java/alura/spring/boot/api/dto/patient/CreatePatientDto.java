package alura.spring.boot.api.dto.patient;

import alura.spring.boot.api.dto.address.CreateAddressDto;

public record CreatePatientDto(String name, String email, String phoneNumber, String socialNumber, CreateAddressDto address) {
}
