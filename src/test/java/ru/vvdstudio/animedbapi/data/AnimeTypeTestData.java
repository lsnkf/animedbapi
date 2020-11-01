package ru.vvdstudio.animedbapi.data;

import ru.vvdstudio.animedbapi.model.AnimeType;

import java.util.UUID;

public class AnimeTypeTestData {

    public static final AnimeType ANIME_TYPE_1 = new AnimeType() {{
        setId(UUID.fromString("94d0a86d-1c0b-41b6-84a9-deabd72f3cd4"));
        setName("TV series");
    }};

    public static final AnimeType ANIME_TYPE_2 = new AnimeType() {{
        setId(UUID.fromString("24fd3087-1a3b-4434-b2ad-ef1b63f5b4b0"));
        setName("OVA");
    }};

    public static final AnimeType ANIME_TYPE_3 = new AnimeType() {{
        setId(UUID.fromString("40d5ec3a-bb96-4039-bab7-0c19dbce45d9"));
        setName("ONA");
    }};

}
