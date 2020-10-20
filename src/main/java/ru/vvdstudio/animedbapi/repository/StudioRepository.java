package ru.vvdstudio.animedbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vvdstudio.animedbapi.model.Studio;

import java.util.UUID;


public interface StudioRepository extends JpaRepository<Studio, UUID> {
}
