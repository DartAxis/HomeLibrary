package ru.dartinc.homelibrary.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import ru.dartinc.homelibrary.dto.TagDto;
import ru.dartinc.homelibrary.model.Tag;

import java.util.List;

@Mapper(componentModel = "spring",uses = TagMapper.class,injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface TagListMapper {
    List<Tag> toModelList(List<TagDto> dtoList);
    List<TagDto> toDtoList(List<Tag> modelList);
}
