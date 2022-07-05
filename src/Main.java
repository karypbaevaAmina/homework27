import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static  Film movie = Fileservice.readFile();

    public static void main(String[] args) {
        movieList();
        releaseYear();
    }

    public static void movieList() {
        for (Movie e: movie.getMovies()) {
            System.out.println(e.getName());
        }
    }

    public static void releaseYear(){
        List<Movie> movies = movie.getMovies();
        Comparator cmp = Comparator.comparingInt(Movie::getYear);
        movies.sort(cmp);
        movies.sort(cmp.reversed());
    }


}


