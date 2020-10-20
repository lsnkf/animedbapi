package ru.vvdstudio.animedbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vvdstudio.animedbapi.model.Genre;

import java.util.UUID;

public interface GenreRepository extends JpaRepository<Genre, UUID> {
}
