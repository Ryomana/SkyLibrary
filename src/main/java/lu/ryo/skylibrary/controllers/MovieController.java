package lu.ryo.skylibrary.controllers;

import lu.ryo.skylibrary.repositories.MovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

    private MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @RequestMapping("/")
    public String getMovies(Model model) {
        model.addAttribute("movies", movieRepository.findAll());

        return "movies";
    }
}
