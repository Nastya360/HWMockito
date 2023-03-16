package ru.netology.javaqa.manager;

import org.example.Posters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    Posters movie1 = new Posters("Фильм1");
    Posters movie2 = new Posters("Фильм2");
    Posters movie3 = new Posters("Фильм3");
    Posters movie4 = new Posters("Фильм4");
    Posters movie5 = new Posters("Фильм5");
    Posters movie6 = new Posters("Фильм6");
    Posters movie7 = new Posters("Фильм7");
    Posters movie8 = new Posters("Фильм8");


    @Test
    public void shouldSaveMovies() {
        PosterManager repo = new PosterManager();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);
        repo.save(movie5);


        Posters[] expected = {movie1, movie2, movie3, movie4, movie5};
        Posters[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSaveNoMovies() {
        PosterManager repo = new PosterManager();

        Posters[] expected = {};
        Posters[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovies() {
        PosterManager repo = new PosterManager();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);
        repo.save(movie5);
        Posters[] expected = {movie1, movie2, movie3, movie4, movie5};
        Posters[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldReverseAllPostersInLimit() {
        PosterManager repo = new PosterManager();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);
        repo.save(movie5);
        Posters[] expected = {movie5, movie4, movie3, movie2, movie1};
        Posters[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldReverseAllPostersLessLimit() {
        PosterManager repo = new PosterManager();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);

        Posters[] expected = {movie3, movie2, movie1};
        Posters[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseAllPostersMoreLimit() {
        PosterManager repo = new PosterManager();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);
        repo.save(movie5);
        repo.save(movie6);
        repo.save(movie7);
        repo.save(movie8);

        Posters[] expected = {movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Posters[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}

