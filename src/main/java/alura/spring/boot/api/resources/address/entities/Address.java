package alura.spring.boot.api.resources.address.entities;

import alura.spring.boot.api.resources.address.dto.WriteAddressDto;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
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

    public void updateAddress(WriteAddressDto dto) {
        if (dto.street() != null) this.street = dto.street();
        if (dto.district() != null) this.district = dto.district();
        if (dto.zipCode() != null) this.zipCode = dto.zipCode();
        if (dto.city() != null) this.city = dto.city();
        if (dto.state() != null) this.state = dto.state();
        if (dto.adjunct() != null) this.adjunct = dto.adjunct();
        if (dto.houseNumber() != null) this.houseNumber = dto.houseNumber();
    }

    public Address(WriteAddressDto dto) {
        this.street = dto.street();
        this.district = dto.district();
        this.zipCode = dto.zipCode();
        this.city = dto.city();
        this.state = dto.state();
        this.adjunct = dto.adjunct();
        this.houseNumber = dto.houseNumber();
    }
}
