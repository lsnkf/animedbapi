package ru.vvdstudio.animedbapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.vvdstudio.animedbapi.model.base.NamedBaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(schema = "main", name = "heroes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Hero extends NamedBaseEntity {
    @Column(name = "description")
    private String description;
    @Column(name = "poster")
    private String poster;

    @ManyToMany(mappedBy = "heroes")
    private Set<Anime> animes;

}
