package guru.springframework.springframework.repositories;

import guru.springframework.springframework.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
