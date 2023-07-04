/*import java.util.*;

public class Conditions {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.println("Adult");

        }
        else{
            System.out.println("not adult");
        }
    }
}
*/

import java.util.*;

public class Conditions{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int button =sc.nextInt();

        switch(button){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid button");
        }
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
       // wap for greater ,lesser and equal
        /*if(a==b){
            System.out.println("Equal");
        }
        else{
            if(a>b){
                System.out.println("a is greater");
            }
            else{
                System.out.println("a is lesser");
            }
        }
         */
    // Wap for odd even     
        /*if(x%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        */
    }
}

