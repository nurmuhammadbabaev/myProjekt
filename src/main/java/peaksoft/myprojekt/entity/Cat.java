package peaksoft.myprojekt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import peaksoft.myprojekt.Gender;

import javax.persistence.*;

@Entity
@Table(name = "cats")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cat {
    @Id
    @SequenceGenerator(name = "cat_sequence",
            sequenceName = "cat_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String catName;
    private String catColor;

}
