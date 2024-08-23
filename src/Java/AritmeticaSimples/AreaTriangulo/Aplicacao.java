package Java.AritmeticaSimples.AreaTriangulo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = null;
        try{
            input = new Scanner(System.in);
            System.out.println("---------DIGITE OS VALOREs EM METROS(m)---------");
            System.out.print("Digite o valor da base do triangulo: ");
            double base = input.nextDouble();
            System.out.print("Digite o valor da altura do triangulo: ");
            double altura = input.nextDouble();
            System.out.printf("A area do triangulo é %.2f\n" +
                    "Base: %.2f\n"+
                    "Altura: %.2f",areaTriangulo(base,altura),base,altura);
        }catch (InputMismatchException e){
            System.err.println(e.getMessage());
        }finally {
            if(input != null){
                input.close();
            }
        }
    }
    public static Double areaTriangulo(double base, double altura){
        return (base*altura)/2;
    }
    }

