package ru.dartinc.homelibrary.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import ru.dartinc.homelibrary.dto.AuthorDto;
import ru.dartinc.homelibrary.model.Author;

import java.util.List;

@Mapper(componentModel = "spring",uses = AuthorMapper.class,injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AuthorListMapper {
    List<AuthorDto> toDtoList(List<Author> modelList);
    List<Author> toModelList(List<AuthorDto> dtoList);
}
