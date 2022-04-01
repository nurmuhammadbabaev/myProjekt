package peaksoft.myprojekt.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.myprojekt.dto.DogRequest;
import peaksoft.myprojekt.dto.DogResponse;
import peaksoft.myprojekt.entity.Dog;
import peaksoft.myprojekt.mapper.DogEditMapper;
import peaksoft.myprojekt.mapper.DogViewMapper;
import peaksoft.myprojekt.repository.DogRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DogService {

    private final DogViewMapper viewMapper;
    private final DogRepository repository;
    private final DogEditMapper editMapper;

    public DogResponse create(DogRequest dogRequest){
        return viewMapper.viewDog(repository.save(editMapper.create(dogRequest)));
    }

    public DogResponse update(Long id,DogRequest dogRequest){
        Dog dog=repository.findById(id).get();
        editMapper.update(dog,dogRequest);
        return viewMapper.viewDog(repository.save(dog));
    }

    public DogResponse getById(Long id){
        return viewMapper.viewDog(repository.findById(id).get());
    }

    public DogResponse deleteById(Long id){
        Dog dog=repository.findById(id).get();
        repository.deleteById(id);
        return viewMapper.viewDog(dog);
    }
    public List<DogResponse> getAllDogs(){
        return viewMapper.viewDogs(repository.findAll());
    }
}
