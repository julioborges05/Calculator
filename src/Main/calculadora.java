package Main;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        int operador = 0;
        operacoes calculo = new operacoes();
        recebeValor v = new recebeValor();

        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Operações Disponiveis:\n(1) +\tSOMA\n(2) -\tSUBTRAÇÃO\n(3) x" +
                    "\tMULTIPLICAÇÃO\n(4) /\tDIVISÃO" +
                    "\nQual operação deseja realizar?\nOBS:Coloque o numero do indice:\t");

            operador = v.recebeInt();

        }while(operador < 1 || operador > 4);

        System.out.println("\n====================AQUI ESTÁ SEU CALCULO====================\n");

        System.out.print("Digite o primeiro numero da operação: ");
        num1 = v.recebeDouble();

        System.out.print("Digite o segundo numero da operação: ");
        num2 = v.recebeDouble();

        switch (operador){
            case 1:
                System.out.println("O resultado da soma entre " + num1 + " e "
                        + num2 + " é de: " + calculo.soma(num1, num2));
                break;
            case 2:
                System.out.println("O resultado da subtração entre " + num1 + " e "
                        + num2 + " é de: " + calculo.subtracao(num1, num2));
                break;
            case 3:
                System.out.println("O resultado da multiplicação entre " + num1 + " e "
                        + num2 + " é de: " + calculo.multiplicacao(num1, num2));
                break;
            case 4:
                System.out.println("O resultado da divisão entre " + num1 + " e "
                        + num2 + " é de: " + calculo.divisao(num1, num2));
                break;
        }
    }
}
