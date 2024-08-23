package Java.AritmeticaSimples.CompraTroco;

import Java.AritmeticaSimples.CompraTroco.Exception.MoneyException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = null;
        try{
            input = new Scanner(System.in);
            System.out.println("---------Ver-O-Peso---------");
            double valortotal = 0;
            for(int i = 1; i < 6; i+=1){
                System.out.printf("Digite o valor do produto %d: ",i);
                double preco = input.nextDouble();
                valortotal+=preco;
            }
            System.out.println("Total no carrinho: "+valortotal);
            System.out.print("Insira a nota de pagamento: ");
            double pagamento = input.nextDouble();
            System.out.println("Troco: "+troco(valortotal,pagamento));
        }catch (InputMismatchException | MoneyException e){
            System.err.println(e.getMessage());
        }finally {
            if(input != null){
                input.close();
            }
        }
    }
    public static double troco(double devendo, double pagamento) throws MoneyException {
        if(pagamento != 5 && pagamento != 10 && pagamento != 20 && pagamento != 50 && pagamento != 100 && pagamento != 200){
            throw new MoneyException();
        }
        else{
            if(devendo == pagamento){
                return 0d;
            }
            else{
                return pagamento - devendo;
            }
        }
    }
}
