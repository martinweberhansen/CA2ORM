
package ca2orm.Info.Person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



/**
 * @author Martin Weber
 */

@Entity
public class Hobby implements Serializable {
    
    @Id
    private Integer Id;
    private String name;
    private String description;
    
    @ManyToMany(mappedBy = "hobbysList")
    private List<Person> persons;
    
    
    
    public Hobby(){}
    
    public Hobby(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
