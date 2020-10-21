package ru.vvdstudio.animedbapi.to.request;

import lombok.Data;

import javax.validation.constraints.Min;

@Data
public class TitlePageParam {
    private String title = "";
    @Min(value = 0)
    private Integer page = 0;
    @Min(value = 1)
    private Integer size = 100;

}
