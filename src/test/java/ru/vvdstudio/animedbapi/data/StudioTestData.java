package ru.vvdstudio.animedbapi.data;

import ru.vvdstudio.animedbapi.model.Studio;

import java.util.UUID;

public class StudioTestData {

    public static final Studio STUDIO_1 = new Studio() {{
        setId(UUID.fromString("28591540-cf52-41f4-8c72-f2c6fa29357a"));
        setName("Studio 1");
    }};

    public static final Studio STUDIO_2 = new Studio() {{
        setId(UUID.fromString("18ff955d-7597-4a1d-a230-238872e6cea9"));
        setName("Studio 2");
    }};

    public static final Studio STUDIO_3 = new Studio() {{
        setId(UUID.fromString("609e7e4b-d118-4cae-a7f4-af6152ae2213"));
        setName("Studio 3");
    }};

}
