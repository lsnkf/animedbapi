package ru.vvdstudio.animedbapi.model.base;

import java.util.UUID;

public interface HasId {
    UUID getId();

    void setId(UUID id);
}
