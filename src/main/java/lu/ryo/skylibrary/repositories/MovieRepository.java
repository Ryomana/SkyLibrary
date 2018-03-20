package lu.ryo.skylibrary.repositories;

import lu.ryo.skylibrary.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {

}
