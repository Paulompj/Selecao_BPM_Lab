package Java.AritmeticaSimples.AreaRetangulo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("---------Digite as informações em metros(m)---------\n");
        try{
        System.out.print("Digite a altura do triângulo: ");
        double altura = input.nextDouble();
        System.out.print("Digite a base do triângulo: ");
        double base = input.nextDouble();
        System.out.printf("A area do seu triangulo é: %.2fm²",areaTriangulo(altura,base));
        }
        catch (InputMismatchException e){
            System.err.println("Erro!\nDigite apenas numeros na entrada");
        }
        finally {
            input.close();
        }
    }
    public static double areaTriangulo(double altura, double base){
        return (base*altura)/2;
    }
}
