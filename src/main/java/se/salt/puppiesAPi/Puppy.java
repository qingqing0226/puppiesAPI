package se.salt.puppiesAPi;


import jakarta.persistence.*;


@Entity
@Table(name = "puppies")
public class Puppy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String breed;

    private String name;

    @Column(name = "birth_date")
    private String birthDate;

    private String image;

    public Puppy() {
    }

    public Puppy(String breed, String name, String birthDate) {
        this.breed = breed;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Puppy(String breed, String name, String birthDate, String image) {
        this.breed = breed;
        this.name = name;
        this.birthDate = birthDate;
        this.image = image;
    }

    public Puppy(long id, String breed, String name, String birthDate, String image) {
        this.id = id;
        this.breed = breed;
        this.name = name;
        this.birthDate = birthDate;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
