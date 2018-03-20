package lu.ryo.skylibrary.bootstrap;

import lu.ryo.skylibrary.model.Movie;
import lu.ryo.skylibrary.repositories.MovieRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private MovieRepository movieRepository;

    public DevBootstrap(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        // Add some movies
        Movie movie_1 = new Movie("One Piece", "D:\\Anime\\OnePiece");
        movieRepository.save(movie_1);

        Movie movie_2 = new Movie("Lord of the Rings", "D:\\Movies\\Lord of the Rings");
        movieRepository.save(movie_2);
    }
}
