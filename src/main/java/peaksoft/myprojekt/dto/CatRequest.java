package peaksoft.myprojekt.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class CatRequest {
@NotNull
    private String catName;
    private String catColor;
}
