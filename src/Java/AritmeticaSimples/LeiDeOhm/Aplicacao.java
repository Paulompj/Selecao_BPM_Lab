package Java.AritmeticaSimples.LeiDeOhm;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = null;
        try {
            input = new Scanner(System.in);
            System.out.println("---------CircuitoElétrico---------");
            System.out.print("Digite o valor da Resistência: ");
            double resistencia = input.nextDouble();
            System.out.print("Digite o valor da Corrente Elétrica: ");
            double correnteEletrica = input.nextDouble();
            System.out.println("Tensão: "+calcularTensao(resistencia,correnteEletrica));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }finally {
            if(input != null){
                input.close();
            }
        }
    }
    public static double calcularTensao(double resistencia, double correnteEletrica){
        return resistencia * correnteEletrica;
    }
}
