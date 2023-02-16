package ru.dartinc.homelibrary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDto {
    private long id;
    private String surname;
    private String name;
    private String middleName;
}
