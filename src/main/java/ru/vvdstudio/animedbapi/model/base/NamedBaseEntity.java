package ru.vvdstudio.animedbapi.model.base;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
abstract public class NamedBaseEntity extends BaseEntity {
    @Column(name = "name", nullable = false)
    private String name;
}
