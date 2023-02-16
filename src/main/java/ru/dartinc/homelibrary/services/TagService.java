package ru.dartinc.homelibrary.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dartinc.homelibrary.dto.TagDto;
import ru.dartinc.homelibrary.mappers.TagListMapper;
import ru.dartinc.homelibrary.mappers.TagMapper;

import ru.dartinc.homelibrary.repository.TagRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagService {
    private final TagRepository repository;
    private final TagListMapper mapperList;

    private final TagMapper mapper;

    public List<TagDto> getAll() {
        return mapperList.toDtoList(repository.findAll());
    }
}
