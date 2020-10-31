package ru.vvdstudio.animedbapi.model.base;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
abstract public class NamedBaseEntity extends BaseEntity {
    @NotBlank
    @Column(name = "name", nullable = false)
    private String name;
}
