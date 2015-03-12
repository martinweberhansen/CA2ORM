
package ca2orm.Info.Person;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Hobby implements Serializable {
    
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
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
