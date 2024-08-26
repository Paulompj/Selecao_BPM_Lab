package Java.AritmeticaSimples.FuncoesTrigonometricas;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = null;
        try{
            input = new Scanner(System.in);
            System.out.print("Digite o valor do angulo em graus: ");
            double anguloGraus = input.nextDouble();
            funcoesTrigonometrica(anguloGraus);
        }catch (InputMismatchException e){
            System.err.println(e.getMessage());
        }finally {
            if(input != null){
                input.close();
            }
        }
    }
    public static void funcoesTrigonometrica(double angulo){
        double radioano = Math.toRadians(angulo);
        //Seno, cos e tan
        System.out.printf("Seno: %f\n" +
                "Cosseno: %f\n" +
                "Tangente: %f",Math.sin(radioano),Math.cos(radioano),Math.tan(radioano));
    }
}
