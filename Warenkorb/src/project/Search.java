package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class Search {
    
    static int kids = 0;
    //query database and get product infos/update ProjectMain
    public static ArrayList<ProductList> mobileSearch(String model){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/kidsDB.db");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM kids WHERE mbrand=? COLLATE NOCASE OR mmodel=? COLLATE NOCASE");
            ps.setString(1, model);
            ps.setString(2, model);
            ResultSet rs = ps.executeQuery();
            
            ProductList pl = null;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("mbrand"),rs.getString("mmodel"),
                		rs.getInt("mprice"),rs.getInt("mquantity"),rs.getString("mdescription"),
                        rs.getString("mphoto"));
                kids++;
                list.add(pl);
            }
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(KidsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
}
