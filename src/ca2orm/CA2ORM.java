
package ca2orm;

import ca2orm.Info.Address;
import ca2orm.Info.CityInfo;
import ca2orm.Info.InfoEntity;
import ca2orm.Info.Person.Company;
import ca2orm.Info.Person.Hobby;
import ca2orm.Info.Person.Person;
import ca2orm.Info.Phone;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Martin Weber
 */
public class CA2ORM {

    public static void main(String[] args) {
        
            EntityManagerFactory emf;
            emf = Persistence.createEntityManagerFactory("CA2ORMPU");
            EntityManager em = emf.createEntityManager();
            
            em.getTransaction().begin();
            
   //         Person testPerson = new Person("Martin","Weber");
//            Company testCompany = new Company();
//            Hobby testHobby = new Hobby();
            InfoEntity testInfoEntity = new InfoEntity();
//            Phone testPhone = new Phone();
//            Address testAddress = new Address();
//            CityInfo testCityInfo = new CityInfo();
            
           
//            em.persist(testCompany);
//            em.persist(testHobby);
            em.persist(testInfoEntity);
//            em.persist(testPhone);
//            em.persist(testAddress);
//            em.persist(testCityInfo);
       //     em.persist(testPerson);
            
            em.getTransaction().commit();
            em.close();
    }
    
}
