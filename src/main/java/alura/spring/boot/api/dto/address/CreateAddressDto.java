package alura.spring.boot.api.dto.address;

public record CreateAddressDto(String street, String district, String zipCode, String city, String state, String adjunct, String houseNumber) {
}
