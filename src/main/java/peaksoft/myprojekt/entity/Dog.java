package peaksoft.myprojekt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "dogs")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Dog {
    @Id
    @SequenceGenerator(name = "dog_sequence",
            sequenceName = "dog_sequence",allocationSize = 1)

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String dogName;
    private String dogColor;
    private String gender;
}
