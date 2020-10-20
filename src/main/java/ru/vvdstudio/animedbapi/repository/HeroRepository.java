package ru.vvdstudio.animedbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vvdstudio.animedbapi.model.Hero;

import java.util.UUID;

public interface HeroRepository extends JpaRepository<Hero, UUID> {
}
