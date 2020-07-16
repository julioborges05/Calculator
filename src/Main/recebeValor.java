package Main;

import java.util.Scanner;

public class recebeValor {
    Scanner scan = new Scanner(System.in);
    public double recebeDouble(){
        double valor = 0;

        try {
            valor = Double.parseDouble(scan.next());
        } catch (NumberFormatException e){
            System.out.println("Não foi possivel reconhecer o valor digitado!!!");
            System.out.close();
        }
        return valor;
    }

    public int recebeInt(){
        int valor = 0;

        try {
            valor = Integer.parseInt(scan.next());
        } catch (NumberFormatException e){
            System.out.println("Digite um valor valido!!!");
        }

        return valor;
    }
}
