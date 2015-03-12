
package ca2orm.Info;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CityInfo implements Serializable {
    
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private Integer Id;
    @Column(name = "zip")
    private String zipCode;
    @Column(name = "city")
    private String city;
    
    @OneToMany(mappedBy = "cityInfo")
    List<Address> addresses = new ArrayList<>();
    
    public CityInfo(){}
    
    public CityInfo(String zipCode, String city) {
        this.zipCode = zipCode;
        this.city = city;
    }
    
    public String getZipCode() {
        return zipCode;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
}
