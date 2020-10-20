package ru.vvdstudio.animedbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vvdstudio.animedbapi.model.Anime;

import java.util.UUID;

public interface AnimeRepository extends JpaRepository<Anime, UUID> {
}
