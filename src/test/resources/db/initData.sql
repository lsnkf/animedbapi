DELETE
FROM main.link_animes_authors;
DELETE
FROM main.link_animes_genres;
DELETE
FROM main.link_animes_heroes;
DELETE
FROM main.animes;
DELETE
FROM main.animes_types;
DELETE
FROM main.authors;
DELETE
FROM main.genres;
DELETE
FROM main.heroes;
DELETE
FROM main.licensers;
DELETE
FROM main.age_ratings;
DELETE
FROM main.studios;
DELETE
FROM main.statuses;

INSERT INTO main.age_ratings(id, name)
VALUES ('7cdd3510-9b4d-4881-8429-fa719e064b22', 'Rating 1'),
       ('8888ef38-49b6-4697-a35f-5f5985be93f0', 'Rating 2'),
       ('4afdbbcf-dc79-4d66-a777-a94bd3a15ea7', 'Rating 3');

INSERT INTO main.animes_types(id, name)
VALUES ('94d0a86d-1c0b-41b6-84a9-deabd72f3cd4', 'TV series'),
       ('24fd3087-1a3b-4434-b2ad-ef1b63f5b4b0', 'OVA'),
       ('40d5ec3a-bb96-4039-bab7-0c19dbce45d9', 'ONA');

INSERT INTO main.authors(id, snp, birth_date)
VALUES ('097ad708-a8bd-4c50-8bc6-16e62c31516c', 'Author 1', '1977-01-15'),
       ('4b78e67d-69a2-481c-8d9b-6866e335c04c', 'Author 2', '1992-05-12'),
       ('84ddd4ff-48ca-450c-b0a7-e9e2ba39e503', 'Author 3', '1955-06-07');

INSERT INTO main.genres(id, name, description)
VALUES ('b885d2e7-51a4-441d-80f9-8f63eaef1f16', 'Genre 1', ''),
       ('a18740ca-5e65-45a9-a796-73d8e6e4928b', 'Genre 2', ''),
       ('bb8fc17e-4782-4ef5-be34-ed7871993dcf', 'Genre 3', '');

INSERT INTO main.heroes(id, name, description, poster)
VALUES ('a09c0494-5d3f-483e-84cb-e9093a68004d', 'Hero 1', '', null),
       ('c26a9f64-39be-42cf-a502-d97ec0e7e608', 'Hero 2', '', null),
       ('7156fd73-3b4c-4d16-8e04-80fbead9764d', 'Hero 3', '', null);

INSERT INTO main.licensers(id, name)
VALUES ('5886886b-4beb-4644-aea6-3ea5825a6f22', 'Licenser 1'),
       ('36339d8f-9661-4ace-a190-9a3a7687398a', 'Licenser 2'),
       ('438f13e7-2a55-408a-8292-103a55542dbd', 'Licenser 3');

INSERT INTO main.statuses(id, name)
VALUES ('6c0173be-0b07-4818-b923-a10fa99cdb93', 'Status 1'),
       ('ac104959-2d9f-44fc-9145-c0ab10258821', 'Status 2'),
       ('c0e213ce-8ecf-470d-b93f-256108c72620', 'Status 3');

INSERT INTO main.studios(id, name)
VALUES ('28591540-cf52-41f4-8c72-f2c6fa29357a', 'Studio 1'),
       ('18ff955d-7597-4a1d-a230-238872e6cea9', 'Studio 2'),
       ('609e7e4b-d118-4cae-a7f4-af6152ae2213', 'Studio 3');

INSERT INTO main.animes(id,
                        title,
                        type_id,
                        episodes_count,
                        poster,
                        announcement_date,
                        start_date_show,
                        age_rating_id,
                        licenser_id,
                        studio_id,
                        status_id)
VALUES ('05d280f6-e14a-4b9e-9751-a47770fd0601',
        'Anime 1',
        '94d0a86d-1c0b-41b6-84a9-deabd72f3cd4',
        12,
        null,
        '2020-10-01',
        null,
        '7cdd3510-9b4d-4881-8429-fa719e064b22',
        '5886886b-4beb-4644-aea6-3ea5825a6f22',
        '28591540-cf52-41f4-8c72-f2c6fa29357a',
        '6c0173be-0b07-4818-b923-a10fa99cdb93'),
       ('46306e08-3b2c-43f9-8a9c-93eaebec1b39',
        'Anime 2',
        '24fd3087-1a3b-4434-b2ad-ef1b63f5b4b0',
        1,
        null,
        '2020-01-10',
        '2020-09-11',
        '7cdd3510-9b4d-4881-8429-fa719e064b22',
        '438f13e7-2a55-408a-8292-103a55542dbd',
        '609e7e4b-d118-4cae-a7f4-af6152ae2213',
        '6c0173be-0b07-4818-b923-a10fa99cdb93');

INSERT INTO main.link_animes_authors(anime_id, author_id)
VALUES ('05d280f6-e14a-4b9e-9751-a47770fd0601', '097ad708-a8bd-4c50-8bc6-16e62c31516c'),
       ('46306e08-3b2c-43f9-8a9c-93eaebec1b39', '4b78e67d-69a2-481c-8d9b-6866e335c04c'),
       ('46306e08-3b2c-43f9-8a9c-93eaebec1b39', '84ddd4ff-48ca-450c-b0a7-e9e2ba39e503');

INSERT INTO main.link_animes_genres(anime_id, genre_id)
VALUES ('05d280f6-e14a-4b9e-9751-a47770fd0601', 'b885d2e7-51a4-441d-80f9-8f63eaef1f16');

INSERT INTO main.link_animes_heroes(anime_id, hero_id)
VALUES ('05d280f6-e14a-4b9e-9751-a47770fd0601', 'a09c0494-5d3f-483e-84cb-e9093a68004d'),
       ('05d280f6-e14a-4b9e-9751-a47770fd0601', 'c26a9f64-39be-42cf-a502-d97ec0e7e608');
