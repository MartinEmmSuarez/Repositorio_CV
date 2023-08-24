package calculadora;


class Calculo {
   private Double num1 , num2;

    public Calculo() {
    }

    public Calculo(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }
    public Double Suma(){
        Double result;
        result = this.num1+this.num2;
        return result;
    }
    public Double Resta(){
        Double result;
        result = this.num1-this.num2;
        return result;
    }
    public Double Multi(){
        Double result;
        result = this.num1*this.num2;
        return result;
    }
    public Double Divi(){
        Double result;
        result = this.num1/this.num2;
        return result;
    }
}
    

