package Java.AritmeticaSimples.MediaAritmetica;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = null;
        try{
            input = new Scanner(System.in);
            Double[] valores = new Double[4];
            Double soma = 0d;
            for(int i = 0; i < 4; i+=1){
                System.out.printf("Digite o %d° valor: ",i+1);
                valores[i] = input.nextDouble();
                soma += valores[i];
            }
            System.out.println("A média dos valores é: "+soma/4);
        }catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
        finally {
            if(input!=null){
                input.close();
            }
        }
    }
}
