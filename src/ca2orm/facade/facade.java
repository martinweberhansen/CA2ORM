
package ca2orm.facade;

import ca2orm.Info.CityInfo;
import ca2orm.Info.Person.Company;
import ca2orm.Info.Person.Person;
import ca2orm.Interface.ORMInterface;
import java.util.ArrayList;

public class facade implements ORMInterface {
    
    Mapper map = new Mapper();
    
    @Override
    public Person getPerson(int id)
    {
        return map.getPerson(id);
    }
    
    @Override
    public Company getInfomationViaPhone(int phone)
    {
        return map.getInfomationViaPhone(phone);
    }
    
    @Override
    public Company getInfomationViaCvr(int cvr)
    {
        return map.getInfomationViaCvr(cvr);
    }
    
    @Override
    public ArrayList<Person> getAllPersonsViaHobby(String Hobby)
    {
        return map.getAllPersonsViaHobby(Hobby);
    }
    
    @Override
    public ArrayList<Person> getAllPersonsViaCity(String zip)
    {
        return map.getAllPersonsViaCity(zip);
    }
    
    @Override
    public int getNumberOfPeopleWithHobby(String hobby)
    {
        ArrayList<Person> pList;
        pList = map.getAllPersonsViaHobby(hobby);
        return pList.size();
    }
    
    @Override
    public ArrayList<CityInfo> getListOfZipCodes()
    {
        return map.getListOfZipCodes();
    }
    
    @Override
    public ArrayList<Company> getCompanyAmountOfWorkers(int numberOfWorkers)
    {
        return map.getCompanyAmountOfWorkers(numberOfWorkers);
    }
}