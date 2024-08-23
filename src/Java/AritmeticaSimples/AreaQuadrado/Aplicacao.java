package Java.AritmeticaSimples.AreaQuadrado;

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
            System.out.print("Digite o valor da aresta do quadrado: ");
            double aresta = input.nextDouble();
            System.out.printf("A area do quadrado é %.1f",areaQuadrado(aresta));
        }catch (InputMismatchException e){
            System.err.println(e.getMessage());
        }finally {
            if(input != null){
                input.close();
            }
        }
    }
    public static double areaQuadrado(Double aresta){
        return Math.pow(aresta,2);
    }
    }
