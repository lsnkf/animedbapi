package ru.vvdstudio.animedbapi.data;

import ru.vvdstudio.animedbapi.model.AgeRating;

import java.util.UUID;

public class AgeRatingTestData {

    public static final AgeRating AGE_RATING_1 = new AgeRating() {{
        setId(UUID.fromString("7cdd3510-9b4d-4881-8429-fa719e064b22"));
        setName("Rating 1");
    }};

    public static final AgeRating AGE_RATING_2 = new AgeRating() {{
        setId(UUID.fromString("8888ef38-49b6-4697-a35f-5f5985be93f0"));
        setName("Rating 2");
    }};

    public static final AgeRating AGE_RATING_3 = new AgeRating() {{
        setId(UUID.fromString("4afdbbcf-dc79-4d66-a777-a94bd3a15ea7"));
        setName("Rating 3");
    }};

}
