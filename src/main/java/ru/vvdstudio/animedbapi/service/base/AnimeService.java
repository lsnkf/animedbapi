package ru.vvdstudio.animedbapi.service.base;

import org.springframework.data.domain.Pageable;
import ru.vvdstudio.animedbapi.model.Anime;
import ru.vvdstudio.animedbapi.to.AnimeListTO;

import java.util.List;
import java.util.UUID;

public interface AnimeService {
    Anime getById(UUID id);
    List<AnimeListTO> getByTitle(String title, Pageable pageable);
}
