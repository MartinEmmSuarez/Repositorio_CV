
package parcial2;

import sun.security.util.Length;

public class Adivina {
    private String contenido[][]=new String [10][2];
    private String palabra,descrip;
    private int i=1;
    private char letra;

    public Adivina(char letra) {
        this.letra = letra;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    

    public Adivina(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    

    public Adivina() {
    }

    public Adivina(String palabra, String descrip) {
        this.palabra = palabra;
        this.descrip = descrip;
    }

    public String[][] getContenido() {
        return contenido;
    }

    public void setContenido(String[][] contenido) {
        this.contenido = contenido;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    public void Llenar(){
        this.contenido[0][0]="ARCO";
        this.contenido[0][1]="Instrumento de caza,usado para la guerra";
        this.contenido[1][0]="HUEVO";
        this.contenido[1][1]="Rico en proteina pero con colesterol";
        this.contenido[2][0]="GATO";
        this.contenido[2][1]="Cazador domestico";
        this.contenido[3][0]="PATO";
        this.contenido[3][1]="Ave a la que no le gusta el frio";
        this.contenido[4][0]="ROSA";
        this.contenido[4][1]="Tene cuidado con las espinas";
        this.contenido[5][0]="PICO";
        this.contenido[5][1]="Herramienta de mineria";
        this.contenido[6][0]="COBRA";
        this.contenido[6][1]="Una de las mas venenosa de su especie";
        this.contenido[7][0]="LEON";
        this.contenido[7][1]="Es conciderado un rey";
        this.contenido[8][0]="BARCO";
        this.contenido[8][1]="Te puedes marear muy facil en el";
        this.contenido[9][0]="ARBOL";
        this.contenido[9][1]="Sombre, oxigeno que mas se le puede pedir?";
    } 
    public String MostrarPalabra(){
        this.i=(int)(Math. random()*9+0);
        this.palabra=this.contenido[this.i][0];
        return this.palabra;
    }
    public String MostrarDescrip(){
        this.descrip =this.contenido[this.i][1];
        return this.descrip;
    }
    public int CantidadLetra(){
        int cantidad;
        cantidad=this.palabra.length();
        return cantidad;
    }
    public int Comprar(){
        char palabra2;
        int ubicacion = this.palabra.length();
        for (int j = 0; j < ubicacion; j++) {
            palabra2= this.palabra.charAt(j);
            if (this.letra==palabra2){
                return j;    
            }
            
        }
        return 0;
    }
    public boolean Igual(){
        char palabra2;
        int ubicacion = this.palabra.length();
        for (int j = 0; j < ubicacion; j++) {
            palabra2= this.palabra.charAt(j);
            if (this.letra==palabra2){
                return true;    
            }     
        } 
        return false;
    }
}
