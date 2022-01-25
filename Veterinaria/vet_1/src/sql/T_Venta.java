//Metodo1: Varios métodos de tabla CLIENTE
package sql;


import java.sql.*;
import javax.swing.JOptionPane;
import vistas.Detalle_Venta;

public class T_Venta {
    
Connection db = null;
Statement st = null;
ResultSet rs = null;
PreparedStatement pst=null;

Integer id_db,cv ;
String dp;
Float vu, total;

String sql;
Boolean a;

//Conexion base datos    
public void conecciondb() {
  try {
      db=DriverManager.getConnection("jdbc:postgresql://localhost:5433/veterinaria","postgres","louis241291"); 
      } catch (SQLException e) {System.out.println("Ocurrio un error : "+e.getMessage());}
}




public void consulta_cliente() throws SQLException {
conecciondb(); st = db.createStatement();id_db=Integer.valueOf(Detalle_Venta.id.getText());
 rs = st.executeQuery("select * from  venta_detalle where id_venta_detalle='"+id_db+"'");
 if (rs.next()) {a=true;
  Detalle_Venta.detalle.setText(rs.getString(2));
  Detalle_Venta.unitario.setText(rs.getString(3));
  Detalle_Venta.cantidad.setText(rs.getString(4));
  Detalle_Venta.total.setText(rs.getString(5));
 }
 else {JOptionPane.showMessageDialog(null,"No Hay registro");a=false;} }

//Limpiar datos entrada de sastifaccion
public void limpia() {
Detalle_Venta.id.setText("");
Detalle_Venta.detalle.setText("");
Detalle_Venta.unitario.setText("");
Detalle_Venta.cantidad.setText("");
Detalle_Venta.total.setText("");

}

public void transacciones() throws SQLException {
 try {
      if (a==false) { 
      conecciondb();
  id_db =Integer.valueOf(Detalle_Venta.id.getText());
  dp=Detalle_Venta.detalle.getText();
  vu =Float.valueOf(Detalle_Venta.unitario.getText());
  cv=Integer.valueOf(Detalle_Venta.cantidad.getText());
  total =Float.valueOf(Detalle_Venta.total.getText());
  sql = "insert into venta_detalle (id_venta_detalle,detalle_producto,valor_unitario,cantidad_venta,total) values (?,?,?,?,?)";
  pst = db.prepareStatement(sql);
  pst.setInt(1,id_db);
  pst.setString(2,dp);
  pst.setFloat(3,vu);
  pst.setInt(4,cv);
  pst.setFloat(5,total);
  pst.executeUpdate();

  //LLAMAR AL PROCEDIMIENTO ALMACENADO
  CallableStatement cst = db.prepareCall("call proventadeta()");
  cst.execute();
  PreparedStatement pstnt = db.prepareStatement("select max(id_venta_detalle) from venta_detalle where total is null ");
  rs=pstnt.executeQuery();
  rs.close();
  JOptionPane.showMessageDialog(null,"La transacción fue realizada con éxito");}
 }catch (SQLException e) {JOptionPane.showMessageDialog(null,"NO SE REALIZÓ LA TRANSACCIÓN,SE EJECUTA EL ROLLBACK");}}
}
