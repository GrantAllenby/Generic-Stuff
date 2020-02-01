package Factorial;

import java.util.*;

/**
 *
 * @author grant
 */
public class Factorial {

    public int num;
    public int factorial;
    public Scanner myScanner;
    public StringBuilder yourResult;
    public String program;

    public Factorial(int num) { 
    }
    
    public static void main (String[] args) {
        String program = "Run";
    while(!"Exit".equals(program)) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your number between 2 and 10");
        int num = myScanner.nextInt();
        StringBuilder yourResult = new StringBuilder("Your number is: ");
            switch (num) {
                case 2:
                    {
                        int factorial = num * 1;
                        yourResult.append(factorial);
                        System.out.println(yourResult.toString());
                        break;
                    }
                case 3:
                    {
                        int factorial = num * 2 * 1;
                        yourResult.append(factorial);
                        System.out.println(yourResult.toString());
                        break;
                    }
                case 4:
                    {
                        int factorial = num * 3 * 2 * 1;
                        yourResult.append(factorial);
                        System.out.println(yourResult.toString());
                        break;
                    }
                case 5:
                    {
                        int factorial = num * 4 * 3 * 2 * 1;
                        yourResult.append(factorial);
                        System.out.println(yourResult.toString());
                        break;
                    }
                case 6:
                    {
                        int factorial = num * 5 * 4 * 3 * 2 * 1;
                        yourResult.append(factorial);
                        System.out.println(yourResult.toString());
                        break;
                    }
                case 7:
                    {
                        int factorial = num * 6 * 5 * 4 * 3 * 2 * 1;
                        yourResult.append(factorial);
                        System.out.println(yourResult.toString());
                        break;
                    }
                case 8:
                    {
                        int factorial = num * 7 * 6 * 5 * 4 * 3 * 2 * 1;
                        yourResult.append(factorial);
                        System.out.println(yourResult.toString());
                        break;
                    }
                case 9:
                    {
                        int factorial = num * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1;
                        yourResult.append(factorial);
                        System.out.println(yourResult.toString());
                        break;
                    }
                case 10:
                    {
                        int factorial = num * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1;
                        yourResult.append(factorial);
                        System.out.println(yourResult.toString());
                        break;
                    }
                default:
                    System.out.println("Outside of parameter: " + 0);
                    break;
            }
            
        System.out.println("type N to exit or any key to continue.");
        program = myScanner.next();
        if("N".equals(program)) {
            break;
        }
    }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
