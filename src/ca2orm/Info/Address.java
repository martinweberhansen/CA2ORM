
package ca2orm.Info;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Address implements Serializable {
    
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private Integer Id;
    @Column(name = "street")
    private String Street;
    @Column(name = "additionalinfo")
    private String additionalinfo;
    
    @ManyToOne
    private CityInfo cityInfo;
    
    @OneToMany(mappedBy = "address")
    List<InfoEntity> infoEntityList = new ArrayList<>();
    
    public Address(){}
    
    public Address(String Street, String description) {
        this.Street = Street;
        this.additionalinfo = description;
    }
    
    public String getStreet() {
        return Street;
    }
    
    public void setStreet(String Street) {
        this.Street = Street;
    }
    
    public String getDescription() {
        return additionalinfo;
    }
    
    public void setDescription(String description) {
        this.additionalinfo = description;
    }
}
