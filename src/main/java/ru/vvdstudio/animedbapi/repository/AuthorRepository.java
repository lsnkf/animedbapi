package ru.vvdstudio.animedbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vvdstudio.animedbapi.model.Author;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<Author, UUID> {
}
