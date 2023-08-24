package acttateti;


public class Tateti {
    private String valor;
    private String panel[][]=new String [3][3];
    private int posiI,posiJ;

    public Tateti() {
    }

    public Tateti(String valor, int posiI, int posiJ) {
        this.valor = valor;
        this.posiI = posiI;
        this.posiJ = posiJ;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String[][] getPanel() {
        return panel;
    }

    public void setPanel(String[][] panel) {
        this.panel = panel;
    }

    public int getPosiI() {
        return posiI;
    }

    public void setPosiI(int posiI) {
        this.posiI = posiI;
    }

    public int getPosiJ() {
        return posiJ;
    }

    public void setPosiJ(int posiJ) {
        this.posiJ = posiJ;
    }

    public String Marcar(){
        this.panel[this.posiI][this.posiJ]=this.valor;
        return null;
    }
    public String Verificar(){
        if ((this.panel[0][0]=="X")&&(this.panel[0][1]=="X")&&(this.panel[0][2]=="X")){
            return"PLAYER 1 WINN..!!";
        }
        else if((this.panel[1][0]=="X")&&(this.panel[1][1]=="X")&&(this.panel[1][2]=="X")){
            return"PLAYER 1 WINN..!!";    
        }
        else if((this.panel[2][0]=="X")&&(this.panel[2][1]=="X")&&(this.panel[2][2]=="X")){
            return"PLAYER 1 WINN..!!";    
        }
        else if((this.panel[0][0]=="X")&&(this.panel[1][0]=="X")&&(this.panel[2][0]=="X")){
            return"PLAYER 1 WINN..!!";    
        }
        else if((this.panel[0][1]=="X")&&(this.panel[1][1]=="X")&&(this.panel[2][1]=="X")){
            return"PLAYER 1 WINN..!!";    
        }
        else if((this.panel[0][2]=="X")&&(this.panel[1][2]=="X")&&(this.panel[2][2]=="X")){
            return"PLAYER 1 WINN..!!";    
        }
        else if((this.panel[0][0]=="X")&&(this.panel[1][1]=="X")&&(this.panel[2][2]=="X")){
            return"PLAYER 1 WINN..!!";    
        }
        else if((this.panel[0][2]=="X")&&(this.panel[1][1]=="X")&&(this.panel[2][0]=="X")){
            return"PLAYER 1 WINN..!!";    
        }
        else if ((this.panel[0][0]=="O")&&(this.panel[0][1]=="O")&&(this.panel[0][2]=="O")){
            return"PLAYER 2 WINN..!!";
        }
        else if((this.panel[1][0]=="O")&&(this.panel[1][1]=="O")&&(this.panel[1][2]=="O")){
            return"PLAYER 2 WINN..!!";    
        }
        else if((this.panel[2][0]=="O")&&(this.panel[2][1]=="O")&&(this.panel[2][2]=="O")){
            return"PLAYER 2 WINN..!!";    
        }
        else if((this.panel[0][0]=="O")&&(this.panel[1][0]=="O")&&(this.panel[2][0]=="O")){
            return"PLAYER 2 WINN..!!";    
        }
        else if((this.panel[0][1]=="O")&&(this.panel[1][1]=="O")&&(this.panel[2][1]=="O")){
            return"PLAYER 2 WINN..!!";    
        }
        else if((this.panel[0][2]=="O")&&(this.panel[1][2]=="O")&&(this.panel[2][2]=="O")){
            return"PLAYER 2 WINN..!!";    
        }
        else if((this.panel[0][0]=="O")&&(this.panel[1][1]=="O")&&(this.panel[2][2]=="O")){
            return"PLAYER 2 WINN..!!";    
        }
        else if((this.panel[0][2]=="O")&&(this.panel[1][1]=="O")&&(this.panel[2][0]=="O")){
            return"PLAYER 2 WINN..!!";    
        }
        else {
            return "Siga jugando";
        }
       
    }
    
}
