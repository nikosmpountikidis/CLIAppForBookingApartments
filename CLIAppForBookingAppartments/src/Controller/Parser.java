package Controller;

import java.util.Scanner;
/**Parser is a scanner class that help us make scanner easier */
public class Parser {

/**We use intParser when we want to scan an integer*/
    public int intParser(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf(">");
        int x = scanner.nextInt();
        return x;
    }
/**We use doubleParser when we want to scan a double number */
    public double doubleParser(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf(">");
        double x = scanner.nextDouble();
        return x;
    }
/**We use stringParser when we want to scan a string*/
    public String stringParser(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf(">");
        String x = scanner.nextLine();
        return x;
    }
/**Here is a check if we enter acceptable value */
    public boolean checkString(String check){
        if(check.isEmpty() || check.isBlank()){
            System.out.println("Invalid input");
            return false;
        }
        return true;
    }

}
