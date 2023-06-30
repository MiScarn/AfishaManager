package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void TestAdd3() {
        MovieManager manager = new MovieManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");


        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestAdd1() {
        MovieManager manager = new MovieManager();

        manager.add("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestAdd0() {
        MovieManager manager = new MovieManager();

        manager.add("Movie 0");

        String[] expected = {"Movie 0"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TestLast9() {
        MovieManager manager = new MovieManager(10); // последние 10 фильмов

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");


        String[] expected = {"Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TestLast10() {
        MovieManager manager = new MovieManager(10);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");
        manager.add("Movie 10");


        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TestLast11() {
        MovieManager manager = new MovieManager(10);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");
        manager.add("Movie 10");
        manager.add("Movie 11");




        String[] expected = {"Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TestLast5() {
        MovieManager manager = new MovieManager(10);

        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");
        manager.add("Movie 10");

        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TestAdd7() {
        MovieManager manager = new MovieManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");


        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestAll10() {
        MovieManager manager = new MovieManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");
        manager.add("Movie 10");


        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7", "Movie 8", "Movie 9", "Movie 10"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestLast1() {
        MovieManager manager = new MovieManager(10);

        manager.add("Movie 10");

        String[] expected = {"Movie 10"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestLast0() {
        MovieManager manager = new MovieManager(10);

        manager.add("Movie 0");

        String[] expected = {"Movie 0"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}


