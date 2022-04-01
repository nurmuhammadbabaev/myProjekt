package peaksoft.myprojekt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.myprojekt.dto.DogRequest;
import peaksoft.myprojekt.dto.DogResponse;
import peaksoft.myprojekt.service.DogService;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/dog")
public class DogController {
    private final DogService service;

    @PostMapping("/save")
    public DogResponse create(@RequestBody @Valid DogRequest dogRequest) {
        return service.create(dogRequest);
    }

    @PutMapping("{id}")
    public DogResponse update(@PathVariable Long id, @RequestBody DogRequest dogRequest) {
        return service.update(id, dogRequest);
    }

    @GetMapping("{id}")
    public DogResponse getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("{id}")
    public DogResponse deleteById(@PathVariable Long id){
        return service.deleteById(id);
    }
    @GetMapping("/all")
    public List<DogResponse> getAllDogs(){
        return service.getAllDogs();
    }
}
