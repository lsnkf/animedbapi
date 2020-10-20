package ru.vvdstudio.animedbapi.model;

import lombok.Getter;
import lombok.Setter;
import ru.vvdstudio.animedbapi.model.base.NamedBaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.util.List;

@Entity
@Table(schema = "main", name = "studios", uniqueConstraints = {
        @UniqueConstraint(name = "main.studios.uk_main_studios_name", columnNames = {"name"})
})
@Getter
@Setter
public class Studio extends NamedBaseEntity {
    @OneToMany(mappedBy = "studio")
    private List<Anime> animes;

}
