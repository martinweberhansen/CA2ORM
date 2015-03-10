
package ca2orm.Info.Person;

import ca2orm.Info.InfoEntity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * @author Martin Weber
 */

@Entity
public class Company extends InfoEntity implements Serializable{
    
    @Id
    private Integer Id;
    private String name;
    private String description;
    private int cvr;
    private int NumEmployees;
    private int marketValue;

    
    public Company(){}
    
    public Company(String name, String description, int cvr, int NumEmployees, int marketValue) {
        this.name = name;
        this.description = description;
        this.cvr = cvr;
        this.NumEmployees = NumEmployees;
        this.marketValue = marketValue;
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

    public int getCvr() {
        return cvr;
    }

    public void setCvr(int cvr) {
        this.cvr = cvr;
    }

    public int getNumEmployees() {
        return NumEmployees;
    }

    public void setNumEmployees(int NumEmployees) {
        this.NumEmployees = NumEmployees;
    }

    public int getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(int marketValue) {
        this.marketValue = marketValue;
    }
    
    
}
