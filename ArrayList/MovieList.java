/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author 84122
 */
public class MovieList {

    // Khai bao ArrayList 
    private ArrayList<String> movieList = new ArrayList<String>();

    /**
     * Them Bo Phim Ua Thich
     *
     * @param movie
     */
    public void addMovie(String movie) {
        movieList.add(movie);
    }

    public void displayList() {
        System.out.println("You have " + movieList.size() + " iteams in favorite");
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println("Movie " + (1 + 1) + movieList.get(i));

        }
    }

    public void upadteMovie(int index, String movie) {
        movieList.set(index, movie);
        System.out.println("Updated ");
        System.out.println("Movie " + (index + 1) + " " + movie);
    }

    public void removeMovie(int index) {
        String movie = movieList.get(index);
        movieList.remove(index);
        System.out.println("Removed " + movie);
    }

    public String findMovie(String search) {
        int position = movieList.indexOf(search);
        if (position > 0) {
            return movieList.get(position);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("---MovieList---");
        System.out.println("------------------");
        MovieList List = new MovieList();
        List.addMovie("KingKong");
        List.addMovie("John With");
        List.addMovie("Kingdom");
        List.addMovie("Avenger");

        List.displayList();

    }
}
