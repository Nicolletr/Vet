package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionsql {
    Connection conn=null;
    String url="jdbc:postgresql://localhost:5432/VETERINARIA_GBD";
    String usuario="nicolletr";
    String clave="louis241291";

    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            conn=DriverManager.getConnection(url,usuario, clave);
          } 
            catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ezror al conectar "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }    
}