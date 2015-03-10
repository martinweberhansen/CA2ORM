
package ca2orm.Info;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



/**
 *
 * @author Martin Weber
 */

@Entity
public class CityInfo implements Serializable {
    
    @Id
    private Integer Id;
    private int zipCode;
    private String city;
    
    
    @OneToMany(mappedBy = "cityInfo")
    List<Address> addresses = new ArrayList<>();
    
    public CityInfo(){}
    
    public CityInfo(int zipCode, String city) {
        this.zipCode = zipCode;
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    
}
