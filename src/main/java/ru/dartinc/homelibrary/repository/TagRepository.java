package ru.dartinc.homelibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dartinc.homelibrary.model.Tag;


@Repository
public interface TagRepository extends JpaRepository<Tag,Long> {
    Tag getTagByTagTitle(String tag);
}
