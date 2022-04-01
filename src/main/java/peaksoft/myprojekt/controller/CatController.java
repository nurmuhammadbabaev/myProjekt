package peaksoft.myprojekt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.myprojekt.dto.CatRequest;
import peaksoft.myprojekt.dto.CatResponse;
import peaksoft.myprojekt.service.CatService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/cat")
public class CatController {

    private final CatService service;

    @PostMapping("/save")
    public CatResponse create(@RequestBody @Valid CatRequest catRequest) {
        return service.create(catRequest);
    }

    @PutMapping("/{id}")
    public CatResponse update(@PathVariable Long id, @RequestBody CatRequest catRequest) {
        return service.update(id, catRequest);
    }

    @GetMapping("/{id}")
    public CatResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public CatResponse deleteById(@PathVariable Long id) {
        return service.deleteById(id);
    }

    @GetMapping("/all")
    public List<CatResponse> getAllCats() {
        return service.getAllCats();
    }
}
