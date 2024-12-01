package org.example.sonadrive.mapper;

import org.example.sonadrive.DTO.CompanyDto;
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
}

