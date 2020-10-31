package ru.vvdstudio.animedbapi.model;

import lombok.Getter;
import lombok.Setter;
import ru.vvdstudio.animedbapi.model.base.NamedBaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(schema = "main", name = "animes_types", uniqueConstraints = {
        @UniqueConstraint(name = "main.animes_types.uk_main_animes_types_name", columnNames = {"name"})
})
@Getter
@Setter
public class AnimeType extends NamedBaseEntity {
    @NotBlank
    @Size(max = 255)
    @OneToMany(mappedBy = "type")
    private List<Anime> animes;
}
