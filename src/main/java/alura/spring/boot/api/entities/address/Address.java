package alura.spring.boot.api.entities.address;

import alura.spring.boot.api.dto.address.CreateAddressDto;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String district;
    private String zipCode;
    private String city;
    private String state;
    private String adjunct;
    private String houseNumber;

    public Address(CreateAddressDto dto) {
        this.street = dto.street();
        this.district = dto.district();
        this.zipCode = dto.zipCode();
        this.city = dto.city();
        this.state = dto.state();
        this.adjunct = dto.adjunct();
        this.houseNumber = dto.houseNumber();
    }
}
