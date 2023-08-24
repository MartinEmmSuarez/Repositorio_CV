package formularioregistro;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar {

    Pattern pater;
    Matcher match;

    public boolean validaCorreo(String correo) {
        pater = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        match = pater.matcher(correo);
        return match.find();
    }

    public boolean validaPass(String pass) {
         String PASSWORD_REGEX = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,8}$";
        pater = Pattern.compile("^(?:(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])|" +
            "(?=.*\\d)(?=.*[^A-Za-z0-9])(?=.*[a-z])|" +
            "(?=.*[^A-Za-z0-9])(?=.*[A-Z])(?=.*[a-z])|" +
            "(?=.*\\d)(?=.*[A-Z])(?=.*[^A-Za-z0-9]))(?!.*(.)\\1{2,})" +
            "[A-Za-z0-9!~<>,;:_=?*+#.\"&§%°()\\|\\[\\]\\-\\$\\^\\@\\/]" +
            "{8,32}$");

       
        return pater.matcher(pass).matches();
    }
    public String generarPass (){
        String clave="";
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            if (i<3){
                clave += rnd.nextInt(10);
            }else if (i<5){
                clave += (char)(rnd.nextInt(26) + 65);
            }else {
                clave += (char)(rnd.nextInt(26) + 97);
            }
        }
        return clave;
        
    }
}
