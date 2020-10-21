package ru.vvdstudio.animedbapi.service;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.vvdstudio.animedbapi.exception.NotFoundException;
import ru.vvdstudio.animedbapi.model.Anime;
import ru.vvdstudio.animedbapi.repository.AnimeRepository;
import ru.vvdstudio.animedbapi.service.base.AnimeService;
import ru.vvdstudio.animedbapi.to.AnimeListTO;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class AnimeServiceImpl implements AnimeService {

    private final AnimeRepository animeRepository;

    public AnimeServiceImpl(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    @Override
    public Anime getById(UUID id) {
        return animeRepository.findById(id)
                .orElseThrow(NotFoundException::new);
    }

    @Override
    public List<AnimeListTO> getByTitle(String title, Pageable pageable) {
        List<Anime> animes = animeRepository.getByTitleContainsIgnoreCase(title, pageable);
        return animes.stream().map(AnimeListTO::getInstanceFromAnime)
                .collect(Collectors.toList());
    }
}
