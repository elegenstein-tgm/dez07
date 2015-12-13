package aberglerEbraendli.dbConnection;

import aberglerEbraendli.entities.Article;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fusions on 13.12.15.
 */
public class DbCon {

    public String username="dez07", password="dez07", db="dez07";
    private Connection con;

    public DbCon(){
        try {
            con = DriverManager.getConnection("jdbc:postgresql:dez07",username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void execute(String sql) throws SQLException{
        con.createStatement().execute(sql);
    }

    public List<Article> searchArticles(String word){
        try {
            ArrayList<Article> ar = new ArrayList<>();
            ResultSet rs = con.createStatement().executeQuery("Select * from article  where name like '%"+word+"%' or content like '%"+word+"%'");
            while (rs.next()){
                int id = rs.getInt(1);
                String title = rs.getString(2);
                String content = rs.getString(3);
                //System.err.println(""+id+title+content);
                ar.add(new Article(id,title,content));
            }
            return ar;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
