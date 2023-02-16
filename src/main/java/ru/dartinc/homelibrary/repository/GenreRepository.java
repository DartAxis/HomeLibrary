package ru.dartinc.homelibrary.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dartinc.homelibrary.model.Genre;


@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
    Genre getGenreByGenreTitle(String title);
}
