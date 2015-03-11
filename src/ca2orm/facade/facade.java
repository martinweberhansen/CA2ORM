
package ca2orm.facade;

import ca2orm.Info.Person.Company;
import ca2orm.Info.Person.Hobby;
import ca2orm.Info.Person.Person;
import ca2orm.Interface.ORMInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Martin Weber
 */
public class facade implements ORMInterface{
    
    Connection con;
    private String URL = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";
    private String userID = "cphmh350";
    private String password = "cphmh350";
    
    @Override
    public Person getPerson(int id)
    {
        String sqlString = "select * from person where ID = " + id;
        PreparedStatement ps = null;
        Person p = null;
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
            System.out.println("Exception in getPerson!");
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.print("SQLException in getPerson: ");
                System.out.println(e.getMessage());
            }
            try {
                if (con != null){
                    con.close();
                }
            } catch (SQLException se){
                System.out.print("SQLException in getPerson: ");
                System.out.println(se.getMessage());
            }
        }
        return p;
    }
    
    @Override
    public Company getInfomationViaPhone(int phone)
    {
        String sqlString1 = "select infoentity_id from phone where number = " + phone;
        PreparedStatement ps = null;
        Company c = null;
        try {
            con = DriverManager.getConnection(URL, userID, password);
            ps = con.prepareStatement(sqlString1);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())
            {
                int infoEntityID = rs.getInt("infoentity_id");
                String sqlString2 = "select * from company where company.id = " + infoEntityID;
                ps = con.prepareStatement(sqlString2);
                ResultSet rs2 = ps.executeQuery();
                
                if (rs.next())
                {
                    String name = rs.getString("name");
                    String description = rs.getString("description");
                    int cvr = rs.getInt("cvr");
                    int numEmployees = rs.getInt("NumEmployees");
                    int marketValue = rs.getInt("marketValue");
                    c = new Company(name, description, cvr, numEmployees, marketValue);
                }
            }
        } catch (Exception e) {
            System.out.println("Exception in getInfomationViaPhone!");
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.print("SQLException in getInfomationViaPhone: ");
                System.out.println(e.getMessage());
            }
            try {
                if (con != null){
                    con.close();
                }
            } catch (SQLException se){
                System.out.print("SQLException in getInfomationViaPhone: ");
                System.out.println(se.getMessage());
            }
        }
        return c;
    }
    
    @Override
    public Company getInfomationViaCvr(int cvr)
    {
        String sqlString = "select * from Company where cvr = " + cvr;
        PreparedStatement ps = null;
        Company c = null;
        try {
            con = DriverManager.getConnection(URL, userID, password);
            ps = con.prepareStatement(sqlString);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())
            {
                String retName = rs.getString("name");
                String retDescription = rs.getString("description");
                int retCvr = rs.getInt("cvr");
                int retNumEmployees = rs.getInt("NumEmployees");
                int retMarketValue = rs.getInt("marketValue");
                c = new Company(retName, retDescription, retCvr, retNumEmployees, retMarketValue);
            }
        } catch (Exception e) {
            System.out.println("Exception in getInfomationViaCvr!");
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.print("SQLException in getInfomationViaCvr: ");
                System.out.println(e.getMessage());
            }
            try {
                if (con != null){
                    con.close();
                }
            } catch (SQLException se){
                System.out.print("SQLException in getInfomationViaCvr: ");
                System.out.println(se.getMessage());
            }
        }
        return c;
    }
    
    @Override
    public ArrayList<Person> getAllPersonsViaHobby(String Hobby)
    {
        String sqlString1 = "select * from Hobby where name = " + Hobby; XXXXX
        PreparedStatement ps = null;
        ArrayList<Person> retList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(URL, userID, password);
            ps = con.prepareStatement(sqlString1);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())
            {
                int infoEntityID = rs.getInt("infoentity_id");
                ArrayList<Person> tempList = new ArrayList<>();
                
                String sqlString2 = "select * from company where company.id = " + infoEntityID;
                ps = con.prepareStatement(sqlString2);
                ResultSet rs2 = ps.executeQuery();
                while (rs2.next())
                {
                    
                }
            }
        } catch (Exception e) {
            System.out.println("Exception in getInfomationViaPhone!");
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.print("SQLException in getInfomationViaPhone: ");
                System.out.println(e.getMessage());
            }
            try {
                if (con != null){
                    con.close();
                }
            } catch (SQLException se){
                System.out.print("SQLException in getInfomationViaPhone: ");
                System.out.println(se.getMessage());
            }
        }
        return c;
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
