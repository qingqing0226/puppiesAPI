package se.salt.puppiesAPi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PuppyService {
    @Autowired
    private PuppyRepository puppyRepository;

    public List<Puppy> getAllPuppies() {
        return puppyRepository.findAll();
    }

    public Puppy savePuppy(Puppy puppy) {
        return puppyRepository.savePuppy(puppy);
    }

    public Puppy getById(long id) {
        return puppyRepository.findById(id);
    }

    public void deleteById(long id) {
        puppyRepository.deleteById(id);
    }
}
