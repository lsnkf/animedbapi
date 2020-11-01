package ru.vvdstudio.animedbapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.vvdstudio.animedbapi.model.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(schema = "main", name = "authors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author extends BaseEntity {
    @NotBlank
    @Size(max = 255)
    @Column(name = "snp", nullable = false)
    private String snp;
    @Column(name = "birth_date")
    private LocalDate birthDate;

    @ManyToMany(mappedBy = "authors")
    private Set<Anime> animes;
}
