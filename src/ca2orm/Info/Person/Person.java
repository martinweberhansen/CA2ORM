
package ca2orm.Info.Person;

import ca2orm.Info.InfoEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Person extends InfoEntity implements Serializable {
    
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    
    @ManyToMany
    private List<Hobby> hobbysList; // = new ArrayList<>();
    
    public Person(){}
    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
