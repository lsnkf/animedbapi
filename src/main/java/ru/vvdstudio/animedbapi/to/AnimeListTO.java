package ru.vvdstudio.animedbapi.to;

import lombok.Data;
import ru.vvdstudio.animedbapi.model.Anime;

import java.util.UUID;

@Data
public class AnimeListTO {
    private UUID id;
    private String title;
    private String poster;

    public static AnimeListTO getInstanceFromAnime(Anime anime) {
        AnimeListTO animeListTO = new AnimeListTO();
        animeListTO.setId(anime.getId());
        animeListTO.setTitle(anime.getTitle());
        animeListTO.setPoster(anime.getPoster());
        return animeListTO;
    }
}
