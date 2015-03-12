
package ca2orm;

import ca2orm.Info.Address;
import ca2orm.Info.CityInfo;
import ca2orm.Info.InfoEntity;
import ca2orm.Info.Person.Company;
import ca2orm.Info.Person.Hobby;
import ca2orm.Info.Person.Person;
import ca2orm.Info.Phone;
import ca2orm.facade.facade;
import java.io.InputStream;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CA2ORM {

    public static void main(String[] args) {
            //Persistence.generateSchema("CA2ORMPU", null);
//            EntityManagerFactory emf;
//            emf = Persistence.createEntityManagerFactory("CA2ORMPU");
//            EntityManager em = emf.createEntityManager();
//            
//            em.getTransaction().begin();
//            
////            InfoEntity p1 = new Person("testPersonFirstName","testPersonLastName");            
////            em.persist(p1);
//            em.getTransaction().commit();
//            em.close();
        
        facade f = new facade();
        System.out.println(f.getPerson(1).toString());
    }
}
