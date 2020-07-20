package springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.model.PetType;

/**
 * Created by Piotr on 2020-07-20
 */
public interface PetTypeRepository extends CrudRepository <PetType, Long> {
}
