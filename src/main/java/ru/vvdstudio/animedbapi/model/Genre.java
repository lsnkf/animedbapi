package ru.vvdstudio.animedbapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.vvdstudio.animedbapi.model.base.NamedBaseEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(schema = "main", name = "genres", uniqueConstraints = {
        @UniqueConstraint(name = "main.genres.uk_main_genres_name", columnNames = {"name"})
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Genre extends NamedBaseEntity {
    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "genres")
    private Set<Anime> animes;

}
