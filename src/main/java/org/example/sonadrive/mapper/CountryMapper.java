package org.example.sonadrive.mapper;


import org.example.sonadrive.DTO.CountryDto;
import org.example.sonadrive.model.Country;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CountryMapper {
    CountryDto toDto(Country country);
}

