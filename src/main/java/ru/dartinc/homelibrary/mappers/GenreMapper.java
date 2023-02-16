package ru.dartinc.homelibrary.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import ru.dartinc.homelibrary.dto.GenreDto;
import ru.dartinc.homelibrary.model.Genre;

@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface GenreMapper {
    GenreDto toDto(Genre genre);

    Genre toModel(GenreDto genreDto);
}
