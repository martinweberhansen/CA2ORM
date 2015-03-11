/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2orm.Interface;

import ca2orm.Info.Person.Company;
import ca2orm.Info.Person.Hobby;
import ca2orm.Info.Person.Person;
import java.util.ArrayList;

/**
 * @author Martin Weber
 */
public interface ORMInterface {
 
        
    public Person getPerson(int id);
            
    public Company getInfomationViaPhone(int phone);
    
    public Company getInfomationViaCvr(int cvr);
    
    public ArrayList<Person> getAllPersonsViaHobby(String Hobby);
        
    public void getAllPersonsViaCity(int zip);
    
    public void getNumberOfPeople(String hobby);
    
    public void getListOfZipCodes();
    
    public void getCompanyAmountOfWorkers(int numberOfWorkers);

}
