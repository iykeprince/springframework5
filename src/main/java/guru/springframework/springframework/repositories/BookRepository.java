package guru.springframework.springframework.repositories;

import guru.springframework.springframework.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
