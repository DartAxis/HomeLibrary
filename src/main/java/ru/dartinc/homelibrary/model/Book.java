package ru.dartinc.homelibrary.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "originaltitle")
    private String originalTitle;

    @Column(name = "yearofedition")
    private String yearOfEdition;

    @Column(name = "isbnoriginal")
    private String isbnOriginal;

    @Column(name = "isbntranslate")
    private String isbnTranslate;

    @Column(name = "yearofeditiontranslate")
    private String yearOfEditionTranslate;

    @OneToOne
    @JoinColumn(name="pubhouse_id")
    private PubHouse pubHouse;

    @OneToOne
    @JoinColumn(name = "pubhousetranslate_id")
    private PubHouse pubHouseTranslate;

    @Column(name = "pathtozipbook",unique = true)
    private String pathToZipBook;

    @Column(name = "format")
    private FileFormatBook fileFormatBook;

    @OneToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "authors_books", joinColumns = @JoinColumn(name = "book_id"),inverseJoinColumns = @JoinColumn(name = "authors_id"))
    private Set<Author> authors;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "books_tags", joinColumns = @JoinColumn(name = "book_id"),inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private Set<Tag> tags;
}
