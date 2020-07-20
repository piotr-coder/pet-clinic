package springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.model.Visit;

/**
 * Created by Piotr on 2020-07-20
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
