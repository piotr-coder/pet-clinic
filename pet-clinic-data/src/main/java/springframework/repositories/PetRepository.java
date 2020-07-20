package springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.model.Pet;

/**
 * Created by Piotr on 2020-07-20
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
