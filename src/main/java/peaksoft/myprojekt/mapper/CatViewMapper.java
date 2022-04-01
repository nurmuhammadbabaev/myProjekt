package peaksoft.myprojekt.mapper;

import org.springframework.stereotype.Component;
import peaksoft.myprojekt.dto.CatResponse;
import peaksoft.myprojekt.entity.Cat;

import java.util.ArrayList;
import java.util.List;

@Component
public class CatViewMapper {

    public CatResponse viewCat(Cat cat) {
        if (cat == null) {
            return null;
        }
        CatResponse catResponse = new CatResponse();
        if (cat.getId()!=null) {
            catResponse.setId(cat.getId());
        }
        catResponse.setCatName(cat.getCatName());
        catResponse.setCatColor(cat.getCatColor());

        return catResponse;
    }

    public List<CatResponse> viewCats(List<Cat> cats){
        List<CatResponse> catResponses=new ArrayList<>();
        for (Cat c:cats) {
            catResponses.add(viewCat(c));
        }
        return catResponses;
    }
}
