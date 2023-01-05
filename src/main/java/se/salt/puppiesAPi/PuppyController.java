package se.salt.puppiesAPi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.List;
import java.util.NoSuchElementException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("/api/puppies")
@CrossOrigin
public class PuppyController {
    @Autowired
    private PuppyService puppyService;
    @GetMapping
    ResponseEntity<List<Puppy>> getAllPuppies() {
        return ResponseEntity.ok(puppyService.getAllPuppies());
    }

    @GetMapping("/{id}")
    ResponseEntity<Puppy> getAllPuppies(@PathVariable long id) {
        try {
            return ResponseEntity.ok(puppyService.getById(id));
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(NOT_FOUND, e.getMessage());
        }
    }

    @PostMapping
    ResponseEntity<Puppy> createPuppy(@RequestBody Puppy puppy){
        Puppy saved = puppyService.savePuppy(puppy);
        return ResponseEntity.created(URI.create("api/puppies/" + saved.getId())).body(saved);
    }

    @PutMapping("/{id}")
    ResponseEntity<Puppy> updatePuppy(@RequestBody Puppy puppy, @PathVariable long id){
        try {
            Puppy found = puppyService.getById(id);
            Puppy saved = puppyService.updatePuppy(found, puppy);
            return ResponseEntity.ok(saved);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(NOT_FOUND, e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deletePuppy(@PathVariable long id) {
        puppyService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
