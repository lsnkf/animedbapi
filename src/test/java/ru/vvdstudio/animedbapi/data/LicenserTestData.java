package ru.vvdstudio.animedbapi.data;

import ru.vvdstudio.animedbapi.model.Licenser;

import java.util.UUID;

public class LicenserTestData {

    public static final Licenser LICENSER_1 = new Licenser() {{
        setId(UUID.fromString("5886886b-4beb-4644-aea6-3ea5825a6f22"));
        setName("Licenser 1");
    }};

    public static final Licenser LICENSER_2 = new Licenser() {{
        setId(UUID.fromString("36339d8f-9661-4ace-a190-9a3a7687398a"));
        setName("Licenser 2");
    }};

    public static final Licenser LICENSER_3 = new Licenser() {{
        setId(UUID.fromString("438f13e7-2a55-408a-8292-103a55542dbd"));
        setName("Licenser 3");
    }};

}
