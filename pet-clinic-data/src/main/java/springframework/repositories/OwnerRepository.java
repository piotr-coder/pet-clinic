package springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.model.Owner;

/**
 * Created by Piotr on 2020-07-20
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
