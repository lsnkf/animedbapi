package ru.vvdstudio.animedbapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;
import ru.vvdstudio.animedbapi.model.base.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(schema = "main", name = "animes")
@NamedEntityGraphs(value = {
        @NamedEntityGraph(name = "anime.all", attributeNodes = {
                @NamedAttributeNode(value = "type"),
                @NamedAttributeNode(value = "ageRating"),
                @NamedAttributeNode(value = "licenser"),
                @NamedAttributeNode(value = "studio"),
                @NamedAttributeNode(value = "status"),
                @NamedAttributeNode(value = "authors"),
                @NamedAttributeNode(value = "genres"),
                @NamedAttributeNode(value = "heroes")
        })
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Anime extends BaseEntity {
    @NotBlank
    @Size(max = 255)
    @Column(name = "title", nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private AnimeType type;

    @NotNull
    @Min(value = 1)
    @Column(name = "episodes_count")
    private Integer episodesCount;
    @Column(name = "poster")
    private String poster;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "announcement_date")
    private LocalDate announcmentDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "start_date_show")
    private LocalDate startDateShow;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "age_rating_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private AgeRating ageRating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "licenser_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Licenser licenser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studio_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Studio studio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Status status;

    @ManyToMany
    @JoinTable(schema = "main", name = "link_animes_authors",
            joinColumns = {@JoinColumn(name = "anime_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id", referencedColumnName = "id")})
    private Set<Author> authors;

    @ManyToMany
    @JoinTable(schema = "main", name = "link_animes_genres",
            joinColumns = {@JoinColumn(name = "anime_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "genre_id", referencedColumnName = "id")})
    private Set<Genre> genres;

    @ManyToMany
    @JoinTable(schema = "main", name = "link_animes_heroes",
            joinColumns = {@JoinColumn(name = "anime_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "hero_id", referencedColumnName = "id")})
    private Set<Hero> heroes;

}
