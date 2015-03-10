
package ca2orm.Info;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 * @author Martin Weber
 */
@Entity 
public class InfoEntity implements Serializable{  // spørg lige til serializable ? ? 
//If an entity instance is passed by value as a detached object,
//the class must implement the Serializable interface.
    
    @Id
    private Integer Id;
    private String email;
  
    @OneToMany
    List<Phone> phones = new ArrayList<>();  //er det uni eller bi?? p.t. sat til uni
    
    @ManyToOne
    private Address address;
    
    
    public InfoEntity(){}
    
    public InfoEntity(int id, String Email) {
        this.Id = id;
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
