package Java.AritmeticaSimples.CelciusFahrenheit;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = null;
        try {
            input = new Scanner(System.in);
            System.out.println("---------ConversorDeTemperatura---------");
            System.out.print("Digite o valor da temperatura em graus CELSIUS: ");
            double celsius = input.nextDouble();
            System.out.println("Em Fahrenheit: "+converterFahrenheit(celsius));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
    public static double converterFahrenheit(double tempCelsius){
        return (tempCelsius*1.8)+32;
    }
}
