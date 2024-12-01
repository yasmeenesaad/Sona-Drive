package org.example.sonadrive.mapper;

import org.example.sonadrive.DTO.CompanyDto;
import org.example.sonadrive.model.Company;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {CountryMapper.class})
public interface CompanyMapper {
    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    CompanyDto toDto(Company company);
}

