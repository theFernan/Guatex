package guatex;
import frontend.Login;
import frontend.PaginaPrincipal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Guatex {
    
    private static Connection connection=null;

    public static void main(String[] args){
        Login login = new Login();
        login.setVisible(true);        
        conexion();
    }
    
    private static void conexion(){
        String user= "theFernan";
        String pass= "fernandoGuerra344";
        String url= "jdbc:mysql://localhost:3306/guatex";
        try{
            connection=DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error De Conexion");
            System.out.println(e);
        }
    }
    
    public Connection getConnection(){
        return Guatex.connection;
    }  
}
