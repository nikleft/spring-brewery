package com.udemy.springbrewery.web.mappers;

import com.udemy.springbrewery.web.domain.Beer;
import com.udemy.springbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDto beerDto);

    BeerDto beerToBeerDto(Beer beer);
}
