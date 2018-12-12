package project;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;


/**
 *
 * @author
 */
public class DbConnector {

	//connect to SQL database/add new user/get registered user
    public static int insertToUser(String username, String name, String password) {
        try {
        	
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/bbs.db");
            
            String sql = "INSERT INTO userinfo"
                              +"(username, name, password)"
                              +"VALUES(?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, username);
            ps.setString(2, name);
            ps.setString(3, password);
            ps.executeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Signing up successful!");
            JFrame notification = new NotificationForm();
            
        } catch (SQLException e) {
            if(e.getErrorCode()==19) //Duplicate username
                return 19;
            
            JFrame errorOc = new ErrorOccured();
        }
        return 0;

    }
    
    public static boolean signer(String username, String pass){
        try {
        	//already known user
        	System.out.println(username+"  user      pass  "+pass);
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/bbs.db");
            String check = "SELECT username, password FROM userinfo WHERE username=? AND password=?";
            PreparedStatement ps = con.prepareStatement(check);
            
            ps.setString(1, username);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(DbConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
