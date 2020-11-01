package ru.vvdstudio.animedbapi.data;

import ru.vvdstudio.animedbapi.model.Author;

import java.time.LocalDate;
import java.util.UUID;

public class AuthorTestData {

    public static final Author AUTHOR_1 = new Author() {{
        setId(UUID.fromString("097ad708-a8bd-4c50-8bc6-16e62c31516c"));
        setSnp("Author 1");
        setBirthDate(LocalDate.of(1977, 1, 15));
    }};

    public static final Author AUTHOR_2 = new Author() {{
        setId(UUID.fromString("4b78e67d-69a2-481c-8d9b-6866e335c04c"));
        setSnp("Author 2");
        setBirthDate(LocalDate.of(1992, 5, 12));
    }};

    public static final Author AUTHOR_3 = new Author() {{
        setId(UUID.fromString("84ddd4ff-48ca-450c-b0a7-e9e2ba39e503"));
        setSnp("Author 3");
        setBirthDate(LocalDate.of(1955, 6, 7));
    }};

}
