import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class main
{
    static Scanner lector = new Scanner(System.in);
    public static void main(String args[])
    {
        
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        System.out.println("5. resolver una expresion algebraica");
        System.out.println("0. salir");
        System.out.println("ingrese numero de operacion:");
        Integer op = lector.nextInt();
        while(op!=0){
            Integer num1;
            Integer num2;
            Integer res;
            if(op == 1){
                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                System.out.println("val 1:");
                num1 = lector.nextInt();
                System.out.println("val 2:");
                num2 = lector.nextInt();
                
                res = num1 + num2;  
                System.out.println("res: " + res);
            }else
            {
                if(op == 2){
                    System.out.println("val 1:");
                     num1 = lector.nextInt();
                    System.out.println("val 2:");
                     num2 = lector.nextInt();
                    
                     res = num1 - num2;
                    System.out.println("res: "+ res);
                }else{
                    if(op == 3){
                        System.out.println("val 1:");
                         num1 = lector.nextInt();
                        System.out.println("val 2:");
                         num2 = lector.nextInt();
                        
                         res = num1 * num2;
                        System.out.println("res: " + res);
                    }else{
                        if(op == 4){
                            System.out.println("val 1:");
                             num1 = lector.nextInt();
                            System.out.println("val 2:");
                             num2 = lector.nextInt();
                             res = num1 / num2;
                            System.out.println("res: " +res);
                        }else{
                            if(op == 5){
                                System.out.println("ingrese expresion:");
                                String expresion = lector.next();
                                System.out.println("Esta opcion no esta desarrollada xD");
                            }
                        }
                    }
                }
            }
            
            System.out.println("1. sumar");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. resolver una expresion algebraica");
            System.out.println("0. salir");
            System.out.println("ingrese numero de operacion que desea realizar:");
            op = lector.nextInt();
        }
        
    }
}
