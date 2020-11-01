package ru.vvdstudio.animedbapi.data;

import ru.vvdstudio.animedbapi.model.Genre;

import java.util.UUID;

public class GenreTestData {

    public static final Genre GENRE_1 = new Genre() {{
        setId(UUID.fromString("b885d2e7-51a4-441d-80f9-8f63eaef1f16"));
        setName("Genre 1");
        setDescription("");
    }};

    public static final Genre GENRE_2 = new Genre() {{
        setId(UUID.fromString("a18740ca-5e65-45a9-a796-73d8e6e4928b"));
        setName("Genre 2");
        setDescription("");
    }};

    public static final Genre GENRE_3 = new Genre() {{
        setId(UUID.fromString("bb8fc17e-4782-4ef5-be34-ed7871993dcf"));
        setName("Genre 3");
        setDescription("");
    }};

}
