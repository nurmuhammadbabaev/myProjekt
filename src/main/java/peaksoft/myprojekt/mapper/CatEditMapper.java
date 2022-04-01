package peaksoft.myprojekt.mapper;

import org.springframework.stereotype.Component;
import peaksoft.myprojekt.dto.CatRequest;
import peaksoft.myprojekt.entity.Cat;

@Component
public class CatEditMapper {

    public Cat create(CatRequest catRequest){
        if(catRequest==null){
            return null;
        }
        Cat cat=new Cat();
        cat.setCatName(catRequest.getCatName());
        cat.setCatColor(catRequest.getCatColor());

        return cat;
    }

    public void update(Cat cat,CatRequest catRequest){
        cat.setCatName(catRequest.getCatName());
        cat.setCatColor(catRequest.getCatColor());

    }
}
