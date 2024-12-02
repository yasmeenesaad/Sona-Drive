package org.example.sonadrive.mapper;

import org.example.sonadrive.DTO.CompanyDto;
import org.example.sonadrive.DTO.CountryDto;
import org.example.sonadrive.model.Company;
import org.example.sonadrive.model.Country;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CompanyMapperTest {

    @Autowired
    private CompanyMapper companyMapper;

    @Test
    public void testMapping() {
        // Setup Country
        Country country = new Country(1, "US");

        // Setup Company
        Company company = new Company(101, "TechCorp", country);

        // Map to DTO
        CompanyDto companyDto = companyMapper.toDto(company);

        assertNotNull(companyDto);
        assertEquals(101, companyDto.id());
        assertEquals("TechCorp", companyDto.name());
        assertNotNull(companyDto.country());
        assertEquals(1, companyDto.country().id());
        assertEquals("US", companyDto.country().isoCode());
    }

    @Test
    public void testMappingWithNullCountry() {
        // Setup Company with null country
        Company company = new Company(102, "NullCountryCorp", null);

        // Map to DTO
        CompanyDto companyDto = companyMapper.toDto(company);

        assertNotNull(companyDto);
        assertEquals(102, companyDto.id());
        assertEquals("NullCountryCorp", companyDto.name());
        assertNull(companyDto.country());
    }

    @Test
    public void testMappingWithNullCompany() {
        // Map null Company
        CompanyDto companyDto = companyMapper.toDto(null);

        assertNull(companyDto);
    }

    @Test
    public void testReverseMapping() {
        // Setup Country DTO
        CountryDto countryDto = new CountryDto(2, "CA");

        // Setup Company DTO
        CompanyDto companyDto = new CompanyDto(201, "ReverseMappedCorp", countryDto);

        // Map to Entity
        Company company = companyMapper.toEntity(companyDto);

        assertNotNull(company);
        assertEquals(201, company.getId());
        assertEquals("ReverseMappedCorp", company.getName());
        assertNotNull(company.getCountry());
        assertEquals(2, company.getCountry().getId());
        assertEquals("CA", company.getCountry().getIsoCode());
    }

    @Test
    public void testReverseMappingWithNullCountry() {
        // Setup Company DTO with null country
        CompanyDto companyDto = new CompanyDto(202, "NoCountryCorp", null);

        // Map to Entity
        Company company = companyMapper.toEntity(companyDto);

        assertNotNull(company);
        assertEquals(202, company.getId());
        assertEquals("NoCountryCorp", company.getName());
        assertNull(company.getCountry());
    }

    @Test
    public void testReverseMappingWithNullCompanyDto() {
        // Map null CompanyDto
        Company company = companyMapper.toEntity(null);

        assertNull(company);
    }

    @Test
    public void testMappingWithEmptyCompanyName() {
        // Setup Country
        Country country = new Country(3, "FR");

        // Setup Company with empty name
        Company company = new Company(103, "", country);

        // Map to DTO
        CompanyDto companyDto = companyMapper.toDto(company);

        assertNotNull(companyDto);
        assertEquals(103, companyDto.id());
        assertEquals("", companyDto.name());
        assertNotNull(companyDto.country());
        assertEquals(3, companyDto.country().id());
        assertEquals("FR", companyDto.country().isoCode());
    }
}
