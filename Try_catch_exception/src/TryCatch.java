import java.util.Scanner;

public class TryCatch {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        float number1 = 0;
        float number2 = 0;


        while(true){
            try {
                System.out.println("enter first num: ");
                String num1 = scanner.next();
                number1 = Float.parseFloat(num1);

                break;
            }catch (NumberFormatException e) {
                System.out.println("no please enter a number ");

            }

        }
            while(true) {
                try {
                    System.out.println("enter sec num: ");
                    String num2 = scanner.next();
                    number2 = Float.parseFloat(num2);
                    if (number2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    break;


                }
                catch( ArithmeticException e){
                    System.out.println(e.getMessage());
                }
                catch (NumberFormatException e) {
                    System.out.println("no please enter a number: ");

            }
        }while(true){
          System.out.println("numbers entered are " + number1 +" & "+  number2);
          Scanner opScan = new Scanner(System.in);
          System.out.println("what operation would you like to do (+, - , *, / ");
          String operation = opScan.next();
           switch(operation){
               case "+":
                   System.out.println("the result is "+ (number1 + number2));
                   break;
               case "-":
                   System.out.println("the result is "+ (number1 - number2));
                   break;
               case "/":
                   try {
                       System.out.println("the result is " + (number1 / number2));
                   }
                   catch(ArithmeticException e){
                       System.out.println(e.getMessage());
                   }
                   break;
               default:
                   System.out.println("invalid operation please try again later");
                     break;
           }
           break;
    }
}}
