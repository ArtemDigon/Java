package hello_world;
import java.util.Scanner;

public class hello_world {

    public static void main(String args[]) {

        System.out.println("Hello World");
        Scanner sr = new Scanner(System.in);
        int  firstDigit = sr.nextInt();
        int secondDigit = sr.nextInt();
        String operation = sr.nextLine();
        sr.close();
        int result = 0;
        switch (operation) {
            case "+":
                result = firstDigit + secondDigit;
                break;
            case "-":
                result = firstDigit - secondDigit;
                break;
            case "*":
                result = firstDigit * secondDigit;
                break;
            case "/":
                result = firstDigit / secondDigit;
                break;
            default:
                System.out.println("Некорректная операция");
                break;
        }
        System.out.println(result);
    }
}
