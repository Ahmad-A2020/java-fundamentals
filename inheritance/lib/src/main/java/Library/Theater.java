package Library;

import interf.AddMoviesReview;
import interf.AddReview;

import java.util.ArrayList;

public class Theater implements AddMoviesReview {
    private String name;
    private ArrayList<String> movies;
    private Review review;
    private String reviewedMovie;

    public Theater(String name, ArrayList<String> movies){
        this.name=name;
        this.movies=movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public void addMovie(String movie){
        this.movies.add(movie);

    }
    public void removeMovie(String movie)  {
        movies.remove(movie);

    }


    @Override
    public String toString() {
        return "Theater{" +
                "name of the Theater is :'" + name + '\'' +
                ", movies showen: " + movies +
                '}';
    }

    @Override
    public void AddReview(String body, String author, int starsNum, String MovieName) {
        this.review= new Review(body,author,starsNum);
        this.reviewedMovie= MovieName;

    }
}
