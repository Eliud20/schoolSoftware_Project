import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conectar {
    
     Connection con = null;
    
    public Connection conexion(){
    try {
    //Driver

    Class.forName("com.mysql.jdbc.Driver");
    //Tipo de conexión, el servidor, base de datos, usuario, password

    con=DriverManager.getConnection("jdbc:mysql://b2wq6mcfp7p3rv0v2suv-mysql.services.clever-cloud.com:3306/b2wq6mcfp7p3rv0v2suv",
            "unngd71jb8olwnlq","098t79cXF7hDchnE3vQb");
    System.out.println("Conexión realizada");
    } catch (ClassNotFoundException | SQLException e) {
    JOptionPane.showMessageDialog(null, "Problemas al conectar " + e); 
    }
    return con;
    }
}
