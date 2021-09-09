package com.luizcorrea.beerstock.mapper;

import com.luizcorrea.beerstock.dto.BeerDTO;
import com.luizcorrea.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
