/*import java.util.*;

public class Calculator{

    public static void main(String args[]){
    Scanner sc = new Scanner (System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int result = sc.nextInt();
    int operator=sc.nextInt();
    
    System.out.println("choose operator");

    switch(operator){
        case '+' : 
        result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
    
 
   }
}

*/

import java.util.*;

public class Calculator{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        switch(n){
            case 1: System.out.println("jan");
            break;
            case 2: System.out.println("feb");
            break;
            case 3: System.out.println("march");
            break;
            case 4: System.out.println("april");
            break;
            default:
            System.out.println("invalid");
        }
    }
}