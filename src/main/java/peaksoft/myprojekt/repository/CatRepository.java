package peaksoft.myprojekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.myprojekt.entity.Cat;



public interface CatRepository extends JpaRepository<Cat,Long> {


}
