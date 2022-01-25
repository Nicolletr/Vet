package sql;


import java.sql.*;
import javax.swing.JOptionPane;
import vistas.Detalle_Compra;

public class T_Compra {
    
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

//Consulta tabla detalle compra
public void consulta_cliente() throws SQLException {
conecciondb(); st = db.createStatement();id_db=Integer.valueOf(Detalle_Compra.id.getText());
 rs = st.executeQuery("select * from  compra_detalle where id_compra_detalle='"+id_db+"'");
 if (rs.next()) {a=true;
  Detalle_Compra.detalle.setText(rs.getString(2));
  Detalle_Compra.unitario.setText(rs.getString(3));
  Detalle_Compra.cantidad.setText(rs.getString(4));
  Detalle_Compra.total.setText(rs.getString(5));
 }
 else {JOptionPane.showMessageDialog(null,"No Hay registro");a=false;} }

//Limpiar datos 
public void limpia() {
Detalle_Compra.id.setText("");
Detalle_Compra.detalle.setText("");
Detalle_Compra.unitario.setText("");
Detalle_Compra.cantidad.setText("");
Detalle_Compra.total.setText("");

}

public void transacciones() throws SQLException {
 try {
      if (a==false) { 
      conecciondb();
  id_db =Integer.valueOf(Detalle_Compra.id.getText());
  dp=Detalle_Compra.detalle.getText();
  vu =Float.valueOf(Detalle_Compra.unitario.getText());
  cv=Integer.valueOf(Detalle_Compra.cantidad.getText());
  total =Float.valueOf(Detalle_Compra.total.getText());
  sql = "insert into compra_detalle (id_compra_detalle,detalle_producto,valor_unitario,cantidad_producto,total) values (?,?,?,?,?)";
  pst = db.prepareStatement(sql);
  pst.setInt(1,id_db);
  pst.setString(2,dp);
  pst.setFloat(3,vu);
  pst.setInt(4,cv);
  pst.setFloat(5,total);
  pst.executeUpdate();

  //PROCEDIMIENTO ALMACENADO
  CallableStatement cst = db.prepareCall("call procompradeta()");
  cst.execute();
  PreparedStatement pstnt = db.prepareStatement("select max(id_compra_detalle) from compra_detalle where total is null ");
  rs=pstnt.executeQuery();
  rs.close();
  JOptionPane.showMessageDialog(null,"La transacción fue realizada con éxito");}
 }catch (SQLException e) {JOptionPane.showMessageDialog(null,"NO SE REALIZÓ LA TRANSACCIÓN,SE EJECUTA EL ROLLBACK");}}
}
