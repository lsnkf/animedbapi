package ru.vvdstudio.animedbapi.controller.all;

import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vvdstudio.animedbapi.model.Anime;
import ru.vvdstudio.animedbapi.service.base.AnimeService;
import ru.vvdstudio.animedbapi.to.AnimeListTO;
import ru.vvdstudio.animedbapi.to.request.TitlePageParam;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = AnimeController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class AnimeController {
    public static final String REST_URL = "/api/rest/animes";

    private final AnimeService animeService;

    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping
    public List<AnimeListTO> getByTitlePageable(@Valid TitlePageParam param) {
        return animeService.getByTitle(param.getTitle(),
                PageRequest.of(param.getPage(), param.getSize()));
    }

    @GetMapping(value = "/{id}")
    public Anime getById(@PathVariable("id") UUID id) {
        return animeService.getById(id);
    }

}
