
package ca2orm.Info;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
@Inheritance(strategy =InheritanceType.JOINED)
public class InfoEntity implements Serializable{  // spørg lige til serializable ? ? 
//If an entity instance is passed by value as a detached object,
//the class must implement the Serializable interface.
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    @Column(name = "id")
    private Integer Id;
    @Column(name = "email")
    private String email;
    
    @OneToMany
    List<Phone> phones = new ArrayList<>();
    
    @ManyToOne
    private Address address;
    
    public InfoEntity(){}
    
    public InfoEntity( String Email) {
        this.email = Email;
    }
    
    public int getId() {
        return Id;
    }
    
    public void setId(int id) {
        this.Id = id;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
