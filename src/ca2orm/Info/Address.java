
package ca2orm.Info;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 *
 * @author Martin Weber
 */

@Entity
public class Address implements Serializable {
    
    @Id
    private Integer Id;
    private String Street;
    private String description;
    
    
    @ManyToOne              //igen uni eller bi, her sat til bi..
    private CityInfo cityInfo;
    
    @OneToMany(mappedBy = "address")
    List<InfoEntity> infoEntityList = new ArrayList<>();
    
    

    
    public Address(){}
    
    public Address(String Street, String description) {
        this.Street = Street;
        this.description = description;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
