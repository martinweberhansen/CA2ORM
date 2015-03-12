
package ca2orm.facade;

import ca2orm.Info.CityInfo;
import ca2orm.Info.Person.Company;
import ca2orm.Info.Person.Person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Mapper {
    Connection con;
    private String URL = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";
    private String userID = "cphmh350";
    private String password = "cphmh350";
    
    public Person getPerson(int id)
    {
        String sqlString = "select * from person where id = " + id;
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
    
    public Company getInfomationViaPhone(int phone)
    {
        String sqlString1 = "select * from infoentity_phone where phones_id = " + phone;
        PreparedStatement ps = null;
        Company c = null;
        try {
            con = DriverManager.getConnection(URL, userID, password);
            ps = con.prepareStatement(sqlString1);
            ResultSet rs1 = ps.executeQuery();
            
            if (rs1.next())
            {
                int infoEntityID = rs1.getInt("infoentity_id");
                String sqlString2 = "select * from company where id = " + infoEntityID;
                ps = con.prepareStatement(sqlString2);
                ResultSet rs2 = ps.executeQuery();
                
                if (rs2.next())
                {
                    String name = rs2.getString("name");
                    String description = rs2.getString("description");
                    int cvr = rs2.getInt("cvr");
                    int numEmployees = rs2.getInt("NumEmployees");
                    int marketValue = rs2.getInt("marketValue");
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
    
    public Company getInfomationViaCvr(int cvr)
    {
        String sqlString = "select * from company where cvr = " + cvr;
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
                int retNumEmployees = rs.getInt("numemployees");
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
    
    public ArrayList<Person> getAllPersonsViaHobby(String Hobby)
    {
        String sqlString1 = "select * from person where Hobby.name = '" + Hobby + "'";
        PreparedStatement ps = null;
        ArrayList<Person> retList = new ArrayList<>();
        Person p = null;
        try {
            con = DriverManager.getConnection(URL, userID, password);
            ps = con.prepareStatement(sqlString1);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())
            {
                int personID = rs.getInt("person_id");
                String sqlString2 = "select * from person where person.id = " + personID;
                ps = con.prepareStatement(sqlString2);
                ResultSet rs2 = ps.executeQuery();
                
                while (rs2.next())
                {
                    String fName = rs2.getString("firstname");
                    String lName = rs2.getString("lastname");
                    p = new Person(fName, lName);
                    retList.add(p);
                }
            }
        } catch (Exception e) {
            System.out.println("Exception in getAllPersonsViaHobby!");
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.print("SQLException in getAllPersonsViaHobby: ");
                System.out.println(e.getMessage());
            }
            try {
                if (con != null){
                    con.close();
                }
            } catch (SQLException se){
                System.out.print("SQLException in getAllPersonsViaHobby: ");
                System.out.println(se.getMessage());
            }
        }
        return retList;
    }
    
    public ArrayList<Person> getAllPersonsViaCity(String zip)
    {
        String sqlString1 = "select street from address where cityinfo = '" + zip + "'";
        PreparedStatement ps = null;
        ArrayList<Person> pList = new ArrayList<>();
        Person p = null;
        try {
            con = DriverManager.getConnection(URL, userID, password);
            ps = con.prepareStatement(sqlString1);
            ResultSet rs1 = ps.executeQuery();
            
            if (rs1.next())
            {
                int addressID = rs1.getInt("id");
                String sqlString2 = "select id from infoentity where infoentity.address_id = " + addressID;
                ps = con.prepareStatement(sqlString2);
                ResultSet rs2 = ps.executeQuery();
                
                if (rs2.next())
                {
                    int pID = rs2.getInt("id");
                    String sqlString3 = "select * from person where person.id = " + pID;
                    ps = con.prepareStatement(sqlString3);
                    ResultSet rs3 = ps.executeQuery();
                    
                    while (rs3.next())
                    {
                        String fName = rs3.getString("firstname");
                        String lName = rs3.getString("lastname");
                        p = new Person(fName, lName);
                        pList.add(p);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception in getAllPersonsViaCity!");
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.print("SQLException in getAllPersonsViaCity: ");
                System.out.println(e.getMessage());
            }
            try {
                if (con != null){
                    con.close();
                }
            } catch (SQLException se){
                System.out.print("SQLException in getAllPersonsViaCity: ");
                System.out.println(se.getMessage());
            }
        }
        return pList;
    }
    
    public ArrayList<CityInfo> getListOfZipCodes()
    {
        String sqlString = "select * from cityinfo";
        PreparedStatement ps = null;
        ArrayList<CityInfo> zipList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(URL, userID, password);
            ps = con.prepareStatement(sqlString);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next())
            {
                String zipCode = rs.getString("zip");
                String city = rs.getString("city");
                CityInfo ci = new CityInfo(zipCode, city);
                zipList.add(ci);
            }
        } catch (Exception e) {
            System.out.println("Exception in getListOfZipCodes!");
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.print("SQLException in getListOfZipCodes: ");
                System.out.println(e.getMessage());
            }
            try {
                if (con != null){
                    con.close();
                }
            } catch (SQLException se){
                System.out.print("SQLException in getListOfZipCodes: ");
                System.out.println(se.getMessage());
            }
        }
        return zipList;
    }
    
    public ArrayList<Company> getCompanyAmountOfWorkers(int numberOfWorkers)
    {
        String sqlString = "select * from Company where numemployees < " + numberOfWorkers;
        PreparedStatement ps = null;
        ArrayList<Company> cList = new ArrayList<>();
        Company c = null;
        try {
            con = DriverManager.getConnection(URL, userID, password);
            ps = con.prepareStatement(sqlString);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next())
            {
                String retName = rs.getString("name");
                String retDescription = rs.getString("description");
                int retCvr = rs.getInt("cvr");
                int retNumEmployees = rs.getInt("numemployees");
                int retMarketValue = rs.getInt("marketvalue");
                c = new Company(retName, retDescription, retCvr, retNumEmployees, retMarketValue);
                cList.add(c);
            }
        } catch (Exception e) {
            System.out.println("Exception in getCompanyAmountOfWorkers!");
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.print("SQLException in getCompanyAmountOfWorkers: ");
                System.out.println(e.getMessage());
            }
            try {
                if (con != null){
                    con.close();
                }
            } catch (SQLException se){
                System.out.print("SQLException in getCompanyAmountOfWorkers: ");
                System.out.println(se.getMessage());
            }
        }
        return cList;
    }
}
