package org.anuj.yoga;


import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class Asana {
    @Id
    private Integer id;
    private String name;
    private String benefits;

    public Asana() {}

}

