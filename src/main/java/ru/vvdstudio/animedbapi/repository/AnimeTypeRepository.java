package ru.vvdstudio.animedbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vvdstudio.animedbapi.model.AnimeType;

import java.util.UUID;

public interface AnimeTypeRepository extends JpaRepository<AnimeType, UUID> {
}
