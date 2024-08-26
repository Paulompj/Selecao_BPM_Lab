package Java.AritmeticaSimples.CompraTroco.Exception;

import java.io.Serial;

public class MoneyException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;

    public MoneyException(){
        super("Nota inexistente!");
    }
}
