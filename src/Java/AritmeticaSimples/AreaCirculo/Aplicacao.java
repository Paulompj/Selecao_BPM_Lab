package Java.AritmeticaSimples.AreaCirculo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = null;
        try{
            input = new Scanner(System.in);
            System.out.println("---------DIGITE OS VALORES EM METROS(m)---------");
            System.out.print("Digite o valor do diametro do círculo: ");
            double diametro = input.nextDouble();
            System.out.printf("Area do Círculo é %.2f\n" +
                    "Raio: %.2f", areaCirculo(diametro), diametro /2);
        }catch (InputMismatchException e){
            System.err.println(e.getMessage());
        }finally {
            if(input != null){
                input.close();
            }
        }
    }
    public static Double areaCirculo(Double diametro){
        double raio = diametro/2;
        return Math.PI*Math.pow(raio,2);
    }
}
