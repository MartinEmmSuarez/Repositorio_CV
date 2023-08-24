
package batalla.naval;

import javax.swing.JOptionPane;

public class BatallaNaval {


    public static void main(String[] args) {
       int matriz[][]=new int[10][10];
       int aleI, aleJ;
       boolean verificador,buscador=false;
       int contador=0,barco=0;
       
        for (int i = 0; i < 10; i++)   //lleno la matriz con 1 siendo 1 = a mar
            for (int j = 0; j < 10; j++) {
            matriz[i][j]=1;    
            }
        
       //TODAS LAS POSICIONES SON ASIGNADAS DE MANERA RANDOM
       
         //cargo 1 barcos de 4 
         
            aleI=(int)Math.floor(Math.random()*(9-0)+0);
            aleJ=(int)Math.floor(Math.random()*(5-0)+0);
            
            if ((matriz[aleI][aleJ]==1)&&(matriz[aleI][aleJ+3]==1)){ //verifico q no el lugar este libre 
                matriz[aleI][aleJ]=2;       //asigno el numero 2 como barco
                matriz[aleI][aleJ+1]=2;
                matriz[aleI][aleJ+2]=2;
                matriz[aleI][aleJ+3]=2;
                
            }
           
        
       
       
       
       do{   //cargo 4 barcos de 1 
            aleI=(int)Math.floor(Math.random()*(9-0)+0);
            aleJ=(int)Math.floor(Math.random()*(9-0)+0);
            for (int i = 0; i < 10; i++) {
                if(matriz[aleI][i]==2){
                   buscador = true;
                   break; 
                }
                else
                    buscador=false;
            }
            if((matriz[aleI][aleJ]==1)&&(buscador==false)){
               matriz[aleI][aleJ]=2; 
               contador++;
            }
            
        }while(contador<3);
        contador=0;
        
        
        
        do {         //cargo 3 carcos de 2   
            aleI=(int)Math.floor(Math.random()*(9-0)+0);
            aleJ=(int)Math.floor(Math.random()*(7-0)+0);
            for (int i = 0; i < 10; i++) {
                if(matriz[aleI][i]==2){
                    buscador=true;
                    break;
                }
                else
                    buscador=false;
            }
            if ((matriz[aleI][aleJ]==1)&&(matriz[aleI][aleJ+1]==1)&&(buscador==false)){ //verifico q el lugar este libre
                matriz[aleI][aleJ]=2;
                matriz[aleI][aleJ+1]=2;
                contador++;
            }
            
        }while (contador <3);
        contador=0;
        
        do{  //cargo 2 barcos de 3 
            aleI=(int)Math.floor(Math.random()*(9-0)+0);
            aleJ=(int)Math.floor(Math.random()*(6-0)+0);
            for (int i = 0; i < 10; i++) {
                if(matriz[aleI][i]==2){
                    buscador=true;
                    break;
                }
                else
                    buscador=false;
            }
            if ((matriz[aleI][aleJ]==1)&&(matriz[aleI][aleJ+2]==1)&&(buscador==false)){ //verifico q no el lugar este libre
                matriz[aleI][aleJ]=2;
                matriz[aleI][aleJ+1]=2;
                matriz[aleI][aleJ+2]=2;
                contador++;
            }
            
        }while(contador < 2);
        contador=0;
        
        
       
       for (int i = 0; i < 10; i++) {   //mostrar matriz
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
       verificador=true;
       while(verificador==true){//bucle infinito para jugar hasta ganar
       
       aleI=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una FILA de 1 al 10"));
       aleJ=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una COLUMNA de 1 al 10"));
       
       aleI=aleI-1;
       aleJ=aleJ-1;
       for (int i = 0; i < 10; i++) {  //verifico q solo quede un solo 2 (barco) en la fila 
                if(matriz[aleI][i]==2){
                    contador++;
            }
       }
        
       if(matriz[aleI][aleJ]==1){
           JOptionPane.showMessageDialog(null,"AGUA");
           
       } 
       else if((matriz[aleI][aleJ]==2)&&(contador==1)){     //condicional para ganar con un break para salir del bucle
           JOptionPane.showMessageDialog(null,"QUE SUERTE UNDIDO..!! GANASTE");
           break;
       }
       else if((matriz[aleI][aleJ]==2)&&(matriz[aleI][aleJ+1]>=1)||(matriz[aleI][aleJ-1]>=1)){
           JOptionPane.showMessageDialog(null,"AVERIADO... SIGUE INTENTNADO");    //luego de averiar cambio el lugar  de 2 a 1 
           matriz[aleI][aleJ]=1;
           
       }
      contador=0; 
      }
       
     }
    }
    

