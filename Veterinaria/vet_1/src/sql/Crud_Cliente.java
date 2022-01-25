package sql;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import getset.V_Cliente;

public class Crud_Cliente extends conexionsql {
    java.sql.Statement st;
    ResultSet rs;
    V_Cliente var = new V_Cliente();
    conexionsql con=new conexionsql();

public void insertar(String id_cliente, String c_i_, String nombre, String apellido, String genero, String direccion, String telefono, String fecha_registro,String antiguedad, String ultima_visita,String numero_mascotas) {
        try {
                Connection conexion =con.conectar();
                st = conexion.createStatement();
                String sql = "insert into cliente(id_cliente,c_i_,nombre,apellido,genero,direccion,telefono,fecha_registro,antiguedad,ultima_visita,numero_mascotas)values('" +id_cliente+"','"+c_i_ + "','" + nombre + "','" + apellido + "','" + genero+ "','" 
                + direccion + "','" + telefono +"','" + fecha_registro+"','" +antiguedad+ "','" +ultima_visita+"','" 
                +numero_mascotas+"');";
                st.execute(sql);
                st.close();
                conexion.close();
                JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }  
    }
    public void mostrar(String id_cliente) {
            try {
                Connection conexion = conectar();
                st = conexion.createStatement();
                String sql = "select * from cliente where id_cliente='" + id_cliente + "';";
                rs = st.executeQuery(sql);
                if (rs.next()) {
                    var.setId_cliente(rs.getString("id_cliente"));
                    var.setC_i_(rs.getString("c_i_"));
                    var.setNombre(rs.getString("nombre"));
                    var.setApellido(rs.getString("apellido"));
                    var.setGenero(rs.getString("genero"));
                    var.setDireccion(rs.getString("direccion"));
                    var.setTelefono(rs.getString("telefono"));
                    var.setFecha_registro(rs.getString("fecha_registro"));
                    var.setAntiguedad(rs.getString("antiguedad"));
                    var.setUltima_visita(rs.getString("ultima_visita"));
                    //var.setNumero_mascotas(rs.getString("numero_mascotas"));

                } else {
                    var.setId_cliente("");
                    var.setC_i_("");
                    var.setNombre("");
                    var.setApellido("");
                    var.setGenero("");
                    var.setDireccion("");
                    var.setTelefono("");
                    var.setFecha_registro("");
                    var.setAntiguedad("");
                    var.setUltima_visita("");
                    //var.setNumero_mascotas("");
                    JOptionPane.showMessageDialog(null, "no se encontro registro", "sin registro", JOptionPane.INFORMATION_MESSAGE);
                }
                st.close();
                conexion.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error en programa " + e, "Erro de sistema", JOptionPane.ERROR_MESSAGE);
            }
        }
 public void actualizar(String id_cliente, String c_i_, String nombre, String apellido, String genero, String direccion, String telefono, String fecha_registro, String antiguedad,String ultima_visita,String numero_mascotas) {
            try {
                Connection conexion = conectar();
                st = conexion.createStatement();
                String sql = "update cliente set id_cliente='" + id_cliente + "',c_i_='"+ c_i_ + "',nombre='" + nombre + "',apellido='" + apellido +"',genero='"+ genero +"',direccion='"+ direccion + "',telefono='" + telefono + "',fecha_registro='" + fecha_registro +"',antiguedad='" + antiguedad + "',ultima_visita='" + ultima_visita +"',numero_mascotas='" + numero_mascotas +"' where id_cliente='" + id_cliente + "'; ";
                st.executeUpdate(sql);
                st.close();
                conexion.close();
                JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    public void eliminar(String id_cliente){
           try {
               Connection conexion=conectar();
               st=conexion.createStatement();
               String sql="delete from cliente where id_cliente='"+id_cliente+"'; ";
               st.executeUpdate(sql);
               st.close();
               conexion.close();
               JOptionPane.showMessageDialog(null, "Registro eliminado correctamente","Eliminado",JOptionPane.INFORMATION_MESSAGE);
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Error al eliminar registro "+ e,"Error",JOptionPane.ERROR_MESSAGE);
           }
       }
}

