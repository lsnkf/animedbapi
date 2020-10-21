package ru.vvdstudio.animedbapi.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vvdstudio.animedbapi.model.Anime;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AnimeRepository extends JpaRepository<Anime, UUID> {

    List<Anime> getByTitleContainsIgnoreCase(String title, Pageable pageable);

    @Override
    @EntityGraph(value = "anime.all")
    Optional<Anime> findById(UUID uuid);

}
