package ru.dartinc.homelibrary.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import ru.dartinc.homelibrary.dto.AuthorDto;
import ru.dartinc.homelibrary.model.Author;

@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AuthorMapper {
    AuthorDto toDto(Author author);
    Author toModel(AuthorDto authorDto);
}
