package peaksoft.myprojekt.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import peaksoft.myprojekt.dto.CatRequest;
import peaksoft.myprojekt.dto.CatResponse;
import peaksoft.myprojekt.entity.Cat;
import peaksoft.myprojekt.mapper.CatEditMapper;
import peaksoft.myprojekt.mapper.CatViewMapper;
import peaksoft.myprojekt.repository.CatRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CatService {
    private final CatViewMapper viewMapper;
    private final CatRepository repository;
    private final CatEditMapper editMapper;

    public CatResponse create(CatRequest catRequest) {
        return viewMapper.viewCat(repository.save(editMapper.create(catRequest)));
    }

    public CatResponse update(Long id, CatRequest catRequest) {
        Cat cat = repository.findById(id).get();
        editMapper.update(cat, catRequest);
        return viewMapper.viewCat(repository.save(cat));
    }

    public CatResponse getById(Long id) {
        return viewMapper.viewCat(repository.findById(id).get());
    }

    public CatResponse deleteById(Long id) {
        Cat cat = repository.findById(id).get();
        repository.deleteById(id);
        return viewMapper.viewCat(cat);
    }

    public List<CatResponse> getAllCats() {
        return viewMapper.viewCats(repository.findAll());
    }

}
