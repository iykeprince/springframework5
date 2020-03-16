package guru.springframework.springframework.repositories;

import guru.springframework.springframework.models.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
