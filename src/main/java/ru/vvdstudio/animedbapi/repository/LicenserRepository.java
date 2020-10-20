package ru.vvdstudio.animedbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vvdstudio.animedbapi.model.Licenser;

import java.util.UUID;

public interface LicenserRepository extends JpaRepository<Licenser, UUID> {
}
