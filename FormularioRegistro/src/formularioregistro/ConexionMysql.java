package formularioregistro;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionMysql {

    private String db = "Usuario";
    private String url = "jdbc:mysql://localhost:3307/";
    private String user = "root";
    private String pass = "";
    private String drive = "com.mysql.cj.jdbc.Driver";
    private static Connection conn = null;
    private static Statement nState = null;
    private static ResultSet nResult = null;

    public ConexionMysql() {

    }

    //se conecta a la base de datos y devuelve true en caso de conectar.    
    public boolean conectar() {
        try {
            Class.forName(drive);
            conn = DriverManager.getConnection(url + db, user, pass);
            // JOptionPane.showMessageDialog(null,"Conectado a: "+db);
            return true;

        } catch (SQLException | ClassNotFoundException e) {
            //  JOptionPane.showMessageDialog(null,"NO conectado");
            Logger.getLogger(ConexionMysql.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    //desconecta a la base de datos
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // agrega a un usuario y devuelve un true en caso de lograrlo 
    public boolean addUsuario(Usuario nUsuario) {
        try {
            nState = conn.createStatement();
            nState.execute("INSERT INTO persona (nombres, apellidos, correo, pass)"
                    + " VALUES('" + nUsuario.getNombre() + "','" + nUsuario.getApellido() + "','" + nUsuario.getCorreo() + "','" + nUsuario.getPass() + "')");
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

    public Usuario buscarCorreo(String correo) {
        Usuario nUsuario = null;
        try {
            nState = conn.createStatement();
            nResult = nState.executeQuery("SELECT * FROM persona WHERE correo = '" + correo + "' ");
            while (nResult.next()) {
                nUsuario = new Usuario();
                nUsuario.setNombre(nResult.getString("nombres"));
                nUsuario.setApellido(nResult.getString("apellidos"));
                nUsuario.setCorreo(nResult.getString("correo"));
                nUsuario.setPass(nResult.getString("pass"));
                return nUsuario;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConexionMysql.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;

    }
    
    public boolean modifUsuario(String correo, String pass) {
        try {
            nState = conn.createStatement();
            nState.execute("UPDATE persona SET pass = '"+pass+"' WHERE correo = '"+ correo +"'");
                   
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }


}
