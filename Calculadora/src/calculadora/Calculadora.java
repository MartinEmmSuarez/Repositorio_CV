
package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        Double num1,num2,result;
        
        Interfaz Calcula = new Interfaz();
        //Calcula.setVisible(false);
        
        num1= Double.parseDouble(JOptionPane.showInputDialog("ingrese num1"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese num2"));
        
        
        
    }
    
}
