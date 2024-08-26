package Java.AritmeticaSimples.CotacaoDolar;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = null;
        try{
            input = new Scanner(System.in);
            System.out.print("Digite a cotação do Dólar: ");
            double cotacaoUS = input.nextDouble();
            System.out.print("Digite a quantida em dólares: ");
            double dolares = input.nextDouble();
            System.out.println("Em R$"+conversorUStoBR(dolares,cotacaoUS));
        }catch (InputMismatchException e){
            System.err.println(e.getMessage());
        }finally {
            if(input != null){
                input.close();
            }
        }
    }
    public static double conversorUStoBR(double dolares, double cotacao){
        return cotacao * dolares;
    }
}
