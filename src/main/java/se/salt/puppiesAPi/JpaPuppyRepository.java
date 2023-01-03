package se.salt.puppiesAPi;

import org.springframework.data.repository.CrudRepository;

public interface JpaPuppyRepository extends CrudRepository<Puppy, Long> {
}
