package ru.netology.javaqa.manager;

import org.example.Posters;

public class PosterManager {
    private int limit;


    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;

    }


    private Posters[] moviePoster = new Posters[0];

    public void save(Posters Poster) {
        Posters[] tmp = new Posters[moviePoster.length + 1];
        ;
        for (int i = 0; i < moviePoster.length; i++) {
            tmp[i] = moviePoster[i];
        }

        tmp[tmp.length - 1] = Poster;
        moviePoster = tmp;

    }

    public Posters[] findAll() {
        return moviePoster;

    }

    public Posters[] findLast() {
        int resultLength;
        if (moviePoster.length < limit) {
            resultLength = moviePoster.length;
        } else {
            resultLength = limit;
        }
        Posters[] tmp = new Posters[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = moviePoster[moviePoster.length - 1 - i];
        }
        return tmp;
    }


}


