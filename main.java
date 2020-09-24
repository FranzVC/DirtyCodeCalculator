import java.util.*;

public class main
{
    static Scanner lector = new Scanner(System.in);
    public static void main(String args[])
    {
        int newOperation;
        Calculator calculator;
        do
        {
            calculator = new Calculator();
            calculator.calculate();
            System.out.println("Desea realizar otra operacion? ");
            System.out.println("1. Si");
            System.out.println("0. No");
            newOperation = lector.nextInt();
        }
        while (newOperation != 0);
    }
}
