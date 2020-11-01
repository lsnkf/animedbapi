package ru.vvdstudio.animedbapi.controller.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.annotation.PostConstruct;

@SpringBootTest
@Sql(scripts = "classpath:db/initData.sql", config = @SqlConfig(encoding = "UTF-8"))
@Transactional
public class BaseTestController {
    private static final CharacterEncodingFilter CHARACTER_ENCODING_FILTER =
            new CharacterEncodingFilter();

    protected MockMvc mockMvc;
    @Autowired
    WebApplicationContext webApplicationContext;

    static {
        CHARACTER_ENCODING_FILTER.setEncoding("UTF-8");
        CHARACTER_ENCODING_FILTER.setForceEncoding(true);
    }

    @PostConstruct
    protected void init() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
                .addFilter(CHARACTER_ENCODING_FILTER)
                .build();
    }

}
