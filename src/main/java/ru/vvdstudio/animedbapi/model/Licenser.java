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
@Table(schema = "main", name = "licensers", uniqueConstraints = {
        @UniqueConstraint(name = "main.licensers.uk_main_licensers_name", columnNames = {"name"})
})
@Getter
@Setter
public class Licenser extends NamedBaseEntity {
    @OneToMany(mappedBy = "licenser")
    private List<Anime> animes;
}
