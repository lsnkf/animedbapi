package ru.vvdstudio.animedbapi.controller.all;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import ru.vvdstudio.animedbapi.controller.base.BaseTestController;
import ru.vvdstudio.animedbapi.data.AnimeTestData;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static ru.vvdstudio.animedbapi.data.AnimeTestData.MATCHER;
import static ru.vvdstudio.animedbapi.data.AnimeTestData.MATCHER_LIST_TO;

class AnimeControllerTest extends BaseTestController {

    @Test
    void getByTitlePageable() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(AnimeController.REST_URL))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MATCHER_LIST_TO.contentJson(AnimeTestData.getAnimeListTO()));
    }

    @Test
    void getById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(AnimeController.REST_URL +
                "/" + AnimeTestData.ANIME_1.getId()))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MATCHER.contentJson(AnimeTestData.getAnime1Full()));
    }

}