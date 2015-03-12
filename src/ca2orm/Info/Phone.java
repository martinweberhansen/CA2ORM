
package ca2orm.Info;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Phone implements Serializable {
    
    @Id
    private int infoentity_id;
    private int number;
    private String description;
    
    public Phone(){}
    
    public Phone(int number, String description) {
        this.number = number;
        this.description = description;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
