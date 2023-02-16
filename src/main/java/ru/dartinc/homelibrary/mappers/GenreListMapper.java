package ru.dartinc.homelibrary.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import ru.dartinc.homelibrary.dto.GenreDto;
import ru.dartinc.homelibrary.model.Genre;

import java.util.List;

@Mapper(componentModel = "spring",uses = GenreMapper.class,injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface GenreListMapper {

    List<GenreDto> toDtoList(List<Genre> modelList);

    List<Genre> toModelList(List<GenreDto> dtoList);

}
