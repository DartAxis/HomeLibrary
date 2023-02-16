package ru.dartinc.homelibrary.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import ru.dartinc.homelibrary.dto.TagDto;
import ru.dartinc.homelibrary.model.Tag;

@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface TagMapper {

    TagDto toDto(Tag tag);
    Tag toModel(TagDto tagDto);
}
