
package formularioregistro;


public class FormularioRegistro {

   
    public static void main(String[] args) {
     ConexionMysql conn = new ConexionMysql();
     boolean conect = conn.conectar();
     Ventana venta = new Ventana();
     venta.setVisible(true); 

      
      
      
    }
    
}
