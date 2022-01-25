package sql;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import getset.V_Proveedor;
public class Crud_Proveedor extends conexionsql {
    java.sql.Statement st;
    ResultSet rs;
    V_Proveedor var = new V_Proveedor();
    conexionsql con=new conexionsql();

    public void insertar(String id_proveedor, String ruc, String nombre_proveedor, String apellido_proveedor) {
        try {
                Connection conexion =con.conectar();
                st = conexion.createStatement();
                String sql = "insert into proveedor(id_proveedor,ruc,nombre_proveedor,apellido_proveedor)"
 + "             values('" +id_proveedor+"','"+ ruc + "','" + nombre_proveedor + "','" + apellido_proveedor + "');";
                st.execute(sql);
                st.close();
                conexion.close();
                JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }  
    }
    public void mostrar(String id_proveedor) {
            try {
                Connection conexion = conectar();
                st = conexion.createStatement();
                String sql = "select * from proveedor where id_proveedor='" + id_proveedor + "';";
                rs = st.executeQuery(sql);
                if (rs.next()) {
                    var.setId_proveedor(rs.getString("id_proveedor"));
                    var.setRuc(rs.getString("ruc"));
                    var.setNombre_proveedor(rs.getString("nombre_proveedor"));
                    var.setApellido_proveedor(rs.getString("apellido_proveedor"));
                } else {
                    var.setId_proveedor("");
                    var.setRuc("");
                    var.setNombre_proveedor("");
                    var.setApellido_proveedor("");
                    JOptionPane.showMessageDialog(null, "no se encontro registro", "sin registro", JOptionPane.INFORMATION_MESSAGE);
                }
                st.close();
                conexion.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error en programa " + e, "Erro de sistema", JOptionPane.ERROR_MESSAGE);
            }
        }
    public void actualizar(String id_proveedor, String ruc, String nombre_proveedor, String apellido_proveedor) {
            try {
                Connection conexion = conectar();
                st = conexion.createStatement();
                String sql = "update proveedor set id_proveedor='" + id_proveedor + "',ruc='" + 
                ruc + "',nombre_proveedor='" + nombre_proveedor + "',apellido_proveedor='" + apellido_proveedor + 
                "' where id_proveedor='" + id_proveedor + "'; ";
                st.executeUpdate(sql);
                st.close();
                conexion.close();
                JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    public void eliminar(String id_proveedor){
           try {
               Connection conexion=conectar();
               st=conexion.createStatement();
               String sql="delete from proveedor where id_proveedor='"+id_proveedor+"'; ";
               st.executeUpdate(sql);
               st.close();
               conexion.close();
               JOptionPane.showMessageDialog(null, "Registro eliminado correctamente","Eliminado",JOptionPane.INFORMATION_MESSAGE);
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Error al eliminar registro "+ e,"Error",JOptionPane.ERROR_MESSAGE);
           }
       }
}
