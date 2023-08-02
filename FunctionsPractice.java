import java.util.*;



public class FunctionsPractice {


    public static void fibonacci(int a,int b){


    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
    }

    
// @7 Wap to print Gcd with function

// public static int Gcd(int n1, int n2){

//     while(n1!=n2){
//         if(n1>n2){
//             return (n1=n1-n2);
        
//            }else{   return (n2=n2-n1);
//            }
      
//     }
//     return n2;

// }

// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n1=sc.nextInt();
//     int n2=sc.nextInt();

//      System.out.println(Gcd(n1,n2));
// }


    // @6 Wap to print the power of the number x,n answer


    // public static int power(int x,int n){

    //    int result=1;
    //    for(int i=1;i<=n;i++){
    //     result=result*x;
    //    }
    //    return result;
    // }

    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int x=sc.nextInt();

    //     System.out.println(power(x, n));
    // }
 

// _____________________________________________________________________
// //@5 Wap using function to print eligibility for voting

//     public static boolean voteAge(int n){
//             if(n>=18){
//                 return true;
//             }
//             return false;

//     }

//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();

//         if(voteAge(n)){
//             System.out.println("can vote");
//         } else{
//             System.out.println("cannot vote");
//         }

//     }




//__________________________________________________________________________
// @4 Wap to print circumference of the circle using radius

    // public static double circumference(double r){

    
    //     return (2*3.14*r);
    // }

    // public static void main(String args[]){

    //     Scanner sc=new Scanner(System.in);
    //     double r=sc.nextInt();


    //     System.out.println(circumference(r));
    // }



    // @3 Wap to find out greater using function

    // public static int greater(int a,int b){


    //     if(a>b){
    //         return a;
    //     }else{
    //         return b;
    //     }
        
    // }

    // public static void main(String args[]){

    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();

    //     System.out.println(greater(a, b));
    // }

// __________________________________________________________________
// // @2 Wap to print sum odd numbers

//     public static void oddNumbers(int n){

//        int sum=0;
//        for(int i=1;i<=n;i++){
//         if(i%2!=0){
//             sum=sum+i;
//         }
//        }
//        System.out.println(sum);
//     }

//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();


//         oddNumbers(n);
//     }

//_______________________________________________________________________________________________
    //@1 Wap to print average of three numbers using functions

        //  public static int average(int a,int b,int c){
        //   return (a+b+c)/3;
        //  }    

        //  public static void main(String args[]){

        //     Scanner sc=new Scanner(System.in);
            
        //     int a=sc.nextInt();
        //     int b=sc.nextInt();
        //     int c=sc.nextInt();

        //     System.out.println(average(a,b,c)); // When their is only one input then we use function calling from main
        //     //but when their is multiple input than we use syso in main function
        //  }
}
