-- create user and db
CREATE USER animedb PASSWORD 'animedb';
CREATE DATABASE animedb OWNER animedb;
-- in db create extension
CREATE EXTENSION pgcrypto;