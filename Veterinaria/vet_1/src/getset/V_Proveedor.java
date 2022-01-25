
package getset;
public class V_Proveedor {

    private static String id_proveedor;
    private static String ruc;
    private static String nombre_proveedor;    
    private static String apellido_proveedor;

    public String getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getApellido_proveedor() {
        return apellido_proveedor;
    }

    public void setApellido_proveedor(String apellido_proveedor) {
        this.apellido_proveedor = apellido_proveedor;
    }
}
