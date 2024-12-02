package org.example.sonadrive.mapper;

import org.example.sonadrive.DTO.CountryDto;
import org.example.sonadrive.model.Country;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class CountryMapperTest {

    private final CountryMapper countryMapper = Mappers.getMapper(CountryMapper.class);

    @Test
    void testToDto() {
        Country country = new Country();
        country.setId(1);
        country.setIsoCode("US");

        CountryDto countryDto = countryMapper.toDto(country);

        assertNotNull(countryDto);
        assertEquals(1, countryDto.id());
        assertEquals("US", countryDto.isoCode());
    }

    @Test
    void testToDtoWithNullCountry() {
        // Map null Country to DTO
        CountryDto countryDto = countryMapper.toDto(null);

        assertNull(countryDto);
    }

    @Test
    void testToDtoWithIncompleteCountry() {
        Country country = new Country();
        country.setId(0); // Default value for ID
        country.setIsoCode(null); // Missing ISO Code

        CountryDto countryDto = countryMapper.toDto(country);

        assertNotNull(countryDto);
        assertEquals(0, countryDto.id());
        assertNull(countryDto.isoCode());
    }

    @Test
    void testToEntity() {
        CountryDto countryDto = new CountryDto(2, "CA");

        Country country = countryMapper.toEntity(countryDto);

        assertNotNull(country);
        assertEquals(2, country.getId());
        assertEquals("CA", country.getIsoCode());
    }

    @Test
    void testToEntityWithNullCountryDto() {
        // Map null CountryDto to Entity
        Country country = countryMapper.toEntity(null);

        assertNull(country);
    }

    @Test
    void testToEntityWithIncompleteCountryDto() {
        CountryDto countryDto = new CountryDto(0, null); // Default ID and missing ISO Code

        Country country = countryMapper.toEntity(countryDto);

        assertNotNull(country);
        assertEquals(0, country.getId());
        assertNull(country.getIsoCode());
    }

    @Test
    void testBiDirectionalMapping() {
        Country originalCountry = new Country();
        originalCountry.setId(3);
        originalCountry.setIsoCode("FR");

        // Map to DTO
        CountryDto countryDto = countryMapper.toDto(originalCountry);
        assertNotNull(countryDto);

        // Map back to Entity
        Country mappedCountry = countryMapper.toEntity(countryDto);

        assertNotNull(mappedCountry);
        assertEquals(originalCountry.getId(), mappedCountry.getId());
        assertEquals(originalCountry.getIsoCode(), mappedCountry.getIsoCode());
    }
}
