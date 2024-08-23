package Java.AritmeticaSimples.AreaQuadrado2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = null;
        try{
            input = new Scanner(System.in);
            System.out.println("---------DIGITE OS VALORE EM METROS(m)---------");
            System.out.print("Digite o valor da diagonal do quadrado: ");
            double diagonal = input.nextDouble();
            System.out.printf("A area do quadrado é %.1f\n" +
                    "Lado: %.1f\n"+
                    "Diagonal: %.2f",areaQuadrado(diagonal),diagonal/Math.sqrt(2),diagonal);
        }catch (InputMismatchException e){
            System.err.println(e.getMessage());
        }finally {
            if(input != null){
                input.close();
            }
        }
    }
    public static Double areaQuadrado(Double diagonalDoQuadrado){
        return (Math.pow(diagonalDoQuadrado,2))/2;
    }
}
