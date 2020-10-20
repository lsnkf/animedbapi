package ru.vvdstudio.animedbapi.model;

import lombok.Getter;
import lombok.Setter;
import ru.vvdstudio.animedbapi.model.base.NamedBaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "main", name = "statuses", uniqueConstraints = {
        @UniqueConstraint(name = "main.statuses.uk_main_statuses_name", columnNames = {"name"})
})
@Getter
@Setter
public class Status extends NamedBaseEntity {
    @OneToMany(mappedBy = "status")
    private List<Anime> animes;

}
