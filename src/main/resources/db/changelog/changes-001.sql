CREATE SCHEMA main;

CREATE TABLE main.animes_types
(
    id   uuid         not null default gen_random_uuid(),
    name varchar(255) not null,
    constraint pk_main_animes_types primary key (id),
    constraint uk_main_animes_types_name unique (name)
);

CREATE TABLE main.age_ratings
(
    id   uuid         not null default gen_random_uuid(),
    name varchar(255) not null,
    constraint pk_main_age_rarings primary key (id),
    constraint uk_main_age_ratings_name unique (name)
);

CREATE TABLE main.studios
(
    id   uuid         not null default gen_random_uuid(),
    name varchar(255) not null,
    constraint pk_main_studios primary key (id),
    constraint uk_main_studios_name unique (name)
);

CREATE TABLE main.statuses
(
    id   uuid         not null default gen_random_uuid(),
    name varchar(255) not null,
    constraint pk_main_statuses primary key (id),
    constraint uk_main_statuses_name unique (name)
);

CREATE TABLE main.licensers
(
    id   uuid         not null default gen_random_uuid(),
    name varchar(255) not null,
    constraint pk_main_licensers primary key (id),
    constraint uk_main_licensers_name unique (name)
);

CREATE TABLE main.genres
(
    id          uuid         not null default gen_random_uuid(),
    name        varchar(255) not null,
    description varchar,
    constraint pk_main_genres primary key (id),
    constraint uk_main_genres_name unique (name)
);

CREATE TABLE main.authors
(
    id         uuid         not null default gen_random_uuid(),
    snp        varchar(255) not null,
    birth_date date,
    constraint pk_main_authors primary key (id)
);

CREATE TABLE main.heroes
(
    id          uuid         not null default gen_random_uuid(),
    name        varchar(255) not null,
    description varchar,
    poster      varchar(255),
    constraint pk_main_heroes primary key (id)
);

CREATE TABLE main.animes
(
    id                uuid         not null default gen_random_uuid(),
    title             varchar(255) not null,
    type_id           uuid         not null,
    episodes_count    integer,
    poster            varchar(255),
    announcement_date date,
    start_date_show   date,
    age_rating_id     uuid         not null,
    licenser_id       uuid,
    studio_id         uuid         not null,
    status_id         uuid         not null,
    constraint pk_main_animes primary key (id),
    constraint fk_main_animes_type foreign key (type_id) references main.animes_types (id) on delete cascade,
    constraint fk_main_animes_age_rating foreign key (age_rating_id) references main.age_ratings (id) on delete cascade,
    constraint fk_main_animes_licenser foreign key (licenser_id) references main.licensers (id) on delete cascade,
    constraint fk_main_animes_studio foreign key (studio_id) references main.studios (id) on delete cascade,
    constraint fk_main_animes_status foreign key (status_id) references main.statuses (id) on delete cascade
);

CREATE TABLE main.link_animes_genres
(
    anime_id uuid not null,
    genre_id uuid not null,
    constraint pk_link_animes_genres primary key (anime_id, genre_id),
    constraint fk_link_animes_genres_anime foreign key (anime_id) references main.animes (id) on delete cascade,
    constraint fk_link_animes_genres_genre foreign key (genre_id) references main.genres (id) on delete cascade
);

CREATE TABLE main.link_animes_authors
(
    anime_id  uuid not null,
    author_id uuid not null,
    constraint pk_link_animes_authors primary key (anime_id, author_id),
    constraint fk_link_animes_authors_anime foreign key (anime_id) references main.animes (id) on delete cascade,
    constraint fk_link_animes_authors_author foreign key (author_id) references main.authors (id) on delete cascade
);

CREATE TABLE main.link_animes_heroes
(
    anime_id uuid not null,
    hero_id  uuid not null,
    constraint pk_link_animes_heroes primary key (anime_id, hero_id),
    constraint fk_link_animes_heroes_anime foreign key (anime_id) references main.animes (id) on delete cascade,
    constraint fk_link_animes_heroes_hero foreign key (hero_id) references main.heroes (id) on delete cascade
);