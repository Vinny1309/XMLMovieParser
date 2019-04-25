package com.sparta.vk;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MoviesDTO movies = new MoviesDTO("resources/movies.xml");

        System.out.println(movies.totalRecords());

        movies.printAllMovieNames();
    }
}
