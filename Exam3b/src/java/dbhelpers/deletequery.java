package dbhelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class deletequery {
    
    private Connection conn;
    
    
    public deletequery(){
        
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(deletequery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(deletequery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(deletequery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(deletequery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void doDelete(int custID){
        
        try {
            //Set up a String to hold our query
            String query = "DELETE FROM customers WHERE custID = ?";
            
            //Create a preparedstatement using our query String
            PreparedStatement ps = conn.prepareStatement(query);
            
            //Fill in the preparedstatement
            ps.setInt(1, custID);
            
            //Execute the query
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(deletequery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}
