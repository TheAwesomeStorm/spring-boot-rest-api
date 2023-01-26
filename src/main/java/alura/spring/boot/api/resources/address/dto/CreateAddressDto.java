package alura.spring.boot.api.resources.address.dto;

public record CreateAddressDto(String street, String district, String zipCode, String city, String state, String adjunct, String houseNumber) {
}
