package peaksoft.myprojekt.mapper;

import org.springframework.stereotype.Component;
import peaksoft.myprojekt.dto.DogRequest;
import peaksoft.myprojekt.entity.Dog;

@Component
public class DogEditMapper {

    public Dog create(DogRequest dogRequest){
        if(dogRequest==null){
            return null;
        }
        Dog dog=new Dog();
        dog.setDogName(dogRequest.getDogName());
        dog.setDogColor(dogRequest.getDogColor());

        return dog;
    }

    public void update(Dog dog,DogRequest dogRequest){

        dog.setDogName(dogRequest.getDogName());
        dog.setDogColor(dogRequest.getDogColor());

    }
}
