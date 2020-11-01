package ru.vvdstudio.animedbapi.data;

import org.springframework.beans.BeanUtils;
import ru.vvdstudio.animedbapi.model.Anime;
import ru.vvdstudio.animedbapi.to.AnimeListTO;
import ru.vvdstudio.animedbapi.util.TestMatcher;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class AnimeTestData {
    public static final TestMatcher<Anime> MATCHER = TestMatcher.usingAssertions(Anime.class,
            (a, e) -> assertThat(a).usingRecursiveComparison(),
            (a, e) -> {
                throw new UnsupportedOperationException();
            });
    public static final TestMatcher<AnimeListTO> MATCHER_LIST_TO = TestMatcher.usingEqualsAssertions(AnimeListTO.class);

    public static final Anime ANIME_1 = new Anime() {{
        setId(UUID.fromString("05d280f6-e14a-4b9e-9751-a47770fd0601"));
        setTitle("Anime 1");
        setType(AnimeTypeTestData.ANIME_TYPE_1);
        setEpisodesCount(12);
        setPoster(null);
        setAnnouncmentDate(LocalDate.of(2020, 10, 1));
        setStartDateShow(null);
        setAgeRating(AgeRatingTestData.AGE_RATING_1);
        setLicenser(LicenserTestData.LICENSER_1);
        setStudio(StudioTestData.STUDIO_1);
        setStatus(StatusTestData.STATUS_1);
    }};

    public static final Anime ANIME_2 = new Anime() {{
        setId(UUID.fromString("46306e08-3b2c-43f9-8a9c-93eaebec1b39"));
        setTitle("Anime 2");
        setType(AnimeTypeTestData.ANIME_TYPE_2);
        setEpisodesCount(1);
        setPoster(null);
        setAnnouncmentDate(LocalDate.of(2020, 1, 10));
        setStartDateShow(LocalDate.of(2020, 8, 11));
        setAgeRating(AgeRatingTestData.AGE_RATING_1);
        setLicenser(LicenserTestData.LICENSER_3);
        setStudio(StudioTestData.STUDIO_3);
        setStatus(StatusTestData.STATUS_1);
    }};

    public static List<AnimeListTO> getAnimeListTO() {
        return List.of(AnimeListTO.getInstanceFromAnime(ANIME_1), AnimeListTO.getInstanceFromAnime(ANIME_2));
    }

    public static Anime getAnime1Full() {
        Anime anime = new Anime();
        BeanUtils.copyProperties(ANIME_1, anime);
        anime.setAuthors(Set.of(AuthorTestData.AUTHOR_1));
        anime.setGenres(Set.of(GenreTestData.GENRE_1));
        anime.setHeroes(Set.of(HeroTestData.HERO_1, HeroTestData.HERO_2));
        return anime;
    }
}
