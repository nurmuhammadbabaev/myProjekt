package peaksoft.myprojekt.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class DogRequest {
    @NotNull

    private String dogName;
    private String dogColor;
}
