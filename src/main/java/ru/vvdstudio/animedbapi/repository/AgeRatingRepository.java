package ru.vvdstudio.animedbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vvdstudio.animedbapi.model.AgeRating;

import java.util.UUID;

public interface AgeRatingRepository extends JpaRepository<AgeRating, UUID> {

}
