package peaksoft.myprojekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.myprojekt.entity.Dog;

public interface DogRepository extends JpaRepository<Dog,Long> {


}
