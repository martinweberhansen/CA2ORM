
package ca2orm.facade;

import ca2orm.Info.Person.Person;
import ca2orm.Interface.ORMInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Martin Weber
 */
public class facade implements ORMInterface{
    
    Connection con;
    private String URL = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";
    private String userID = "cphmh350";
    private String password = "";
    
    @Override
    public Person getPerson(int id)
    {
        String sqlString = "select * from person where ID = "+id;
        PreparedStatement ps = null;
        Person p=null;
        try {
            con = DriverManager.getConnection(URL, userID, password);
            ps = con.prepareStatement(sqlString);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())
            {
                String fName = rs.getString("firstname");
                String lName = rs.getString("lastname");
                p = new Person(fName,lName);
            }
            
        } catch (Exception e) {
            System.out.println("Excption in get Person!");
        }
        return p;
    }
            
    @Override
    public void getInfomationViaPhone(int phone)
    {
        
    }
    
    @Override
    public void getInfomationViaCvr(int cvr)
    {
        
    }
    
    @Override
    public void getAllPersonsViaHobby(String Hobby)
    {
        
    }
        
    @Override
    public void getAllPersonsViaCity(int zip)
    {
        
    }
    
    @Override
    public void getNumberOfPeople(String hobby)
    {
        
    }
    
    @Override
    public void getListOfZipCodes()
    {}
    
    @Override
    public void getCompanyAmountOfWorkers(int numberOfWorkers)
    {
        
    }
}
