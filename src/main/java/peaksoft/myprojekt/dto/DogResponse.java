package peaksoft.myprojekt.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DogResponse {

    private Long id;
    private String dogName;
    private String dogColor;
    private String gender;
}
