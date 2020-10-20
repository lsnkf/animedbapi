package ru.vvdstudio.animedbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vvdstudio.animedbapi.model.Status;

import java.util.UUID;

public interface StatusRepository extends JpaRepository<Status, UUID> {
}
