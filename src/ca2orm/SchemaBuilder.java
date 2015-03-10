
package ca2orm;

import javax.persistence.Persistence;

public class SchemaBuilder {
    
    public static void main(String[] args) {
         Persistence.generateSchema("CA2ORMPU", null);
         
    }
}
