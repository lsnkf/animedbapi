package ru.vvdstudio.animedbapi.data;

import ru.vvdstudio.animedbapi.model.Hero;

import java.util.UUID;

public class HeroTestData {

    public static final Hero HERO_1 = new Hero() {{
        setId(UUID.fromString("a09c0494-5d3f-483e-84cb-e9093a68004d"));
        setName("Hero 1");
        setDescription("");
        setPoster(null);
    }};

    public static final Hero HERO_2 = new Hero() {{
        setId(UUID.fromString("c26a9f64-39be-42cf-a502-d97ec0e7e608"));
        setName("Hero 2");
        setDescription("");
        setPoster(null);
    }};

    public static final Hero HERO_3 = new Hero() {{
        setId(UUID.fromString("7156fd73-3b4c-4d16-8e04-80fbead9764d"));
        setName("Hero 3");
        setDescription("");
        setPoster(null);
    }};

}
