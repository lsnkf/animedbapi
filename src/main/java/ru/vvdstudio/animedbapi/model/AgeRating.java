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
@Table(schema = "main", name = "age_ratings", uniqueConstraints = {
        @UniqueConstraint(name = "main.age_ratings.uk_main_age_ratings_name", columnNames = {"name"})
})
@Getter
@Setter
public class AgeRating extends NamedBaseEntity {
    @OneToMany(mappedBy = "ageRating")
    private List<Anime> animes;
}
