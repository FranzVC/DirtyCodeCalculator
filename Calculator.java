import java.util.*;

public class Calculator {
    static Scanner lector = new Scanner(System.in);
    public int number1;
    public int number2;
    public int result;
    public int operation;

    public Calculator() {
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        System.out.println("ingrese numero de operacion:");
        operation = lector.nextInt();
        System.out.println("Ingresar primer valor:");
        number1 = lector.nextInt();
        System.out.println("Ingresar segundo valor:");
        number2 = lector.nextInt();
    }

    public int sum() {
        return result = number1 + number2;
    }

    public int subtract() {
        return result = number1 - number2;
    }

    public int multiplication() {
        return result = number1 * number2;
    }

    public int division() {
        return result = number1 / number2;
    }

    public void calculate() {
        switch (operation) {
            case 1:
                sum();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
        }
        System.out.println("La respuesta es:" + result);
    }
}