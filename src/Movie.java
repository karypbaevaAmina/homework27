import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie implements Comparable<Movie> {
   private String name;
   private int year;
    private String description;
    private Director director;
    private Cast [] cast;

    public Movie(String name, int year, String description, Director director, Cast[] cast, List<Movie> movies) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
        this.movies = movies;
    }

    List<Movie> movies = new ArrayList<>();
    public Movie() {
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public Director getDirector() {
        return director;
    }

    public Cast[] getCast() {
        return cast;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setCast(Cast[] cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", director=" + director +
                ", cast=" + Arrays.toString(cast) +
                ", movies=" + movies +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return this.getYear()-o.getYear();
    }



}
