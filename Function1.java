import java.util.Scanner;

public class Function1 {

// @Wap for number is odd or even

    public static boolean isEven(int n){
        // for(int i=0;i<=n;i++)
            if(n%2==0){
                return true;
            }
           
        
         return false;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(isEven(n)){
            System.out.println("even");

        }else{
            System.out.println("odd");
        }
        isEven(n);
    }




    // public static boolean isPrime(int n){
    //     if(n<=1)
    //     return false;

    //     for(int i=2;i<n;i++)
    //     if(n%i==0)
    //     return false;

    //     return true;
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n=sc.nextInt();

    //     if(isPrime(n)){
    //         System.out.println("Prime");
    //     }
    //     else{
    //         System.out.println("not prime");
    //     }
    //     isPrime(n);
    // }
}

