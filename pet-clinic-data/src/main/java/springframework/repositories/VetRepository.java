package springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.model.Vet;

/**
 * Created by Piotr on 2020-07-20
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
