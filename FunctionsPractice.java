import java.util.*;



public class FunctionsPractice {


// @4 Wap to print circumference of the circle using radius

    public static double circumference(double r){

    
        return (2*3.14*r);
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();


        System.out.println(circumference(r));
    }



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
