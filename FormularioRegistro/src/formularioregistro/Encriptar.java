
package formularioregistro;

import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class Encriptar {
    String LLAVE = "wary";
     public SecretKeySpec CrearClave(String llave) {
        try {
            byte[] cadena = llave.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            cadena = md.digest(cadena);
            cadena = Arrays.copyOf(cadena, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(cadena, "AES");
            return secretKeySpec;
        } catch (Exception e) {
            return null;
        }

    }

    // Encriptar
    public String Encriptar(String encriptar) {
     
        try {
        SecretKeySpec secretKeySpec = CrearClave(LLAVE);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            
            byte [] cadena = encriptar.getBytes("UTF-8");
            byte [] encriptada = cipher.doFinal(cadena);
            String cadena_encriptada = Base64.encode(encriptada);
            return cadena_encriptada;
            
            
            
        } catch (Exception e) {
            return "";
        }
    }

    // Des-encriptación
     public String Desencriptar(String desencriptar) {
     
        try {
            SecretKeySpec secretKeySpec = CrearClave(LLAVE);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            
            byte [] cadena = Base64.decode(desencriptar);
            byte [] desencriptacioon = cipher.doFinal(cadena);
            String cadena_desencriptada = new String(desencriptacioon);
            return cadena_desencriptada;
            
        } catch (Exception e) {
            return "";
        }
}
}
