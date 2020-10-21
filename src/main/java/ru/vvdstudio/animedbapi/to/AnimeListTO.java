package ru.vvdstudio.animedbapi.to;

import lombok.Data;
import ru.vvdstudio.animedbapi.model.Anime;

@Data
public class AnimeListTO {
    private String title;
    private String poster;

    public static AnimeListTO getInstanceFromAnime(Anime anime) {
        AnimeListTO animeListTO = new AnimeListTO();
        animeListTO.setTitle(anime.getTitle());
        animeListTO.setPoster(anime.getPoster());
        return animeListTO;
    }
}
