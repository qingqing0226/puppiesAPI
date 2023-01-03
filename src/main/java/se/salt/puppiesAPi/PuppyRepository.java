package se.salt.puppiesAPi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PuppyRepository {
    @Autowired
    private JpaPuppyRepository jpaPuppyRepository;

    public List<Puppy> findAll() {
        return (List<Puppy>) jpaPuppyRepository.findAll();
    }

    public Puppy savePuppy(Puppy puppy) {
        return jpaPuppyRepository.save(puppy);
    }

    public Puppy findById(long id) {
        return jpaPuppyRepository.findById(id).orElseThrow();
    }

    public void deleteById(long id) {
        jpaPuppyRepository.deleteById(id);
    }
}
