package ru.dartinc.homelibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dartinc.homelibrary.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
}

