/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2orm.Interface;

/**
 * @author Martin Weber
 */
public interface ORMInterface {
 
        
    public void getPerson();
            
    public void getInfomationViaPhone(int phone);
    
    public void getInfomationViaCvr(int cvr);
    
    public void getAllPersonsViaHobby(String Hobby);
        
    public void getAllPersonsViaCity(int zip);
    
    public void getNumberOfPeople(String hobby);
    
    public void getListOfZipCodes();
    
    public void getCompanyAmountOfWorkers(int numberOfWorkers);

}
