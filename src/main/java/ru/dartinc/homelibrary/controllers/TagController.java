package ru.dartinc.homelibrary.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dartinc.homelibrary.dto.TagDto;
import ru.dartinc.homelibrary.services.TagService;

import java.util.List;

@RestController
@RequestMapping("/rest/api/webversion1.0/tags")
@RequiredArgsConstructor
public class TagController {
    private final TagService service;
    @GetMapping
    public ResponseEntity<List<TagDto>> getAllTags(){
        return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
    }
}
