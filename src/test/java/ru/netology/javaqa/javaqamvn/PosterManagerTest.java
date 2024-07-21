package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void notFilms() {
        PosterManager manager = new PosterManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsMin() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Бладшот");
        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsNorm() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Джентельмены");
        String[] expected = {"Бладшот", "Вперед", "Джентельмены"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmMax() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Джентельмены");
        manager.addPoster("Отель Белград");
        manager.addPoster("Человек невидимка");
        String[] expected = {"Бладшот", "Вперед", "Джентельмены", "Отель Белград", "Человек невидимка"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Джентельмены");
        manager.addPoster("Отель Белград");
        manager.addPoster("Человек невидимка");
        String[] expected = { "Человек невидимка", "Отель Белград", "Джентельмены", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLessMax() {
        PosterManager manager = new PosterManager();
        manager.addPoster("1");
        manager.addPoster("2");
        manager.addPoster("3");
        manager.addPoster("4");
        String[] expected = {"4", "3", "2", "1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMin() {
        PosterManager manager = new PosterManager();
        manager.addPoster("1");
        String[] expected = {"1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoveMin() {
        PosterManager manager = new PosterManager();
        manager.addPoster("1");
        manager.addPoster("2");
        String[] expected = {"2", "1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
