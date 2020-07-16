package Main;

public class operacoes {
    private double resultado;

    public double soma(double num1, double num2){
        resultado = num1 + num2;
        return resultado;
    }

    public double subtracao(double num1, double num2){
        resultado = num1 - num2;
        return resultado;
    }

    public double multiplicacao(double num1, double num2){
        resultado = num1 * num2;
        return resultado;
    }

    public double divisao(double num1, double num2){
        resultado = num1 / num2;
        return resultado;
    }
}
