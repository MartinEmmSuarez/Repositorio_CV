
package parcial2;

import javax.swing.JOptionPane;

public class Parcial2 {

    public static void main(String[] args) {
       Interfaz jugar = new Interfaz();
       Adivina hola = new Adivina();
       hola.Llenar();
       String mostrar= hola.MostrarPalabra();
       
        System.out.println(hola.MostrarPalabra());
        System.out.println(hola.MostrarDescrip());
        System.out.println(hola.CantidadLetra());
       
      
       
    //jugar.setVisible(true);
      
      
}    
}
