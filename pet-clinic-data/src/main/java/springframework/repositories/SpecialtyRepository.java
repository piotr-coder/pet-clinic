package springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.model.Speciality;

/**
 * Created by Piotr on 2020-07-20
 */
public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
