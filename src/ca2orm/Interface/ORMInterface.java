
package ca2orm.Interface;

import ca2orm.Info.CityInfo;
import ca2orm.Info.Person.Company;
import ca2orm.Info.Person.Hobby;
import ca2orm.Info.Person.Person;
import java.util.ArrayList;

public interface ORMInterface {
    
    public Person getPerson(int id);
    
    public Company getInfomationViaPhone(int phone);
    
    public Company getInfomationViaCvr(int cvr);
    
    public ArrayList<Person> getAllPersonsViaHobby(String Hobby);
    
    public ArrayList<Person> getAllPersonsViaCity(String zip);
    
    public int getNumberOfPeopleWithHobby(String hobby);
    
    public ArrayList<CityInfo> getListOfZipCodes();
    
    public ArrayList<Company> getCompanyAmountOfWorkers(int numberOfWorkers);
    
    // -------------------------------------------------
    
    public void createPerson();
    
    public void createCompany();
    
    public void createHobby();
    
    public void createAddress();
    
    public void createPhone();
    
    // -------------------------------------------------
    
    public void updatePerson();
    
    public void updateCompany();
    
    public void updateAddress();
    
    public void updateCityInfo();
    
    public void updatePhone();
    
    public void updateHobby();
    
    // -------------------------------------------------
    
    public void deletePerson();
    
    public void deleteCompany();
    
    public void deleteCityInfo();
    
    public void deleteHobby();
    
    public void deleteAddress();
}
