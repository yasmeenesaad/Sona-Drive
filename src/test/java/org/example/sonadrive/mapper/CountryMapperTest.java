package org.example.sonadrive.mapper;

import org.example.sonadrive.DTO.CountryDto;
import org.example.sonadrive.model.Country;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountryMapperTest {

    private final CountryMapper countryMapper = Mappers.getMapper(CountryMapper.class);

    @Test
    void testToDto() {
        Country country = new Country();
        country.setId(1);
        country.setIsoCode("US");

        CountryDto countryDto = countryMapper.toDto(country);

        assertEquals(1, countryDto.id());
        assertEquals("US", countryDto.isoCode());
    }
}