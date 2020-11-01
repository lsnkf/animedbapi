package ru.vvdstudio.animedbapi.data;

import ru.vvdstudio.animedbapi.model.Status;

import java.util.UUID;

public class StatusTestData {

    public static final Status STATUS_1 = new Status() {{
        setId(UUID.fromString("6c0173be-0b07-4818-b923-a10fa99cdb93"));
        setName("Status 1");
    }};

    public static final Status STATUS_2 = new Status() {{
        setId(UUID.fromString("ac104959-2d9f-44fc-9145-c0ab10258821"));
        setName("Status 2");
    }};

    public static final Status STATUS_3 = new Status() {{
        setId(UUID.fromString("c0e213ce-8ecf-470d-b93f-256108c72620"));
        setName("Status 3");
    }};

}
