package peaksoft.myprojekt.mapper;

import org.springframework.stereotype.Component;
import peaksoft.myprojekt.dto.DogRequest;
import peaksoft.myprojekt.dto.DogResponse;
import peaksoft.myprojekt.entity.Dog;

import java.util.ArrayList;
import java.util.List;

@Component
public class DogViewMapper {

    public DogResponse viewDog(Dog dog){
        if(dog==null){
            return null;
        }

        DogResponse dogResponse=new DogResponse();
        if(dog.getId()!=null){
            dogResponse.setId(dog.getId());
        }
        dogResponse.setDogName(dog.getDogName());
        dogResponse.setDogColor(dog.getDogColor());
        dogResponse.setGender(dog.getGender());

        return dogResponse;

    }
    public List<DogResponse> viewDogs(List<Dog> dogs){
        List<DogResponse> responses=new ArrayList<>();
        for (Dog d:dogs) {
            responses.add(viewDog(d));
        }
        return responses;
    }
}
