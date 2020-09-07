package springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.model.Owner;

import java.util.List;

/**
 * Created by Piotr on 2020-07-20
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName (String lastName);
    List<Owner> findAllByLastNameLikeIgnoreCase(String lastName);
}
