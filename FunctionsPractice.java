import java.util.*;



public class FunctionsPractice {
         public static int average(int a,int b,int c){
          return (a+b+c)/3;
         }    

         public static void main(String args[]){

            Scanner sc=new Scanner(System.in);
            
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            System.out.println(average(a,b,c)); // When their is only one input then we use function calling from main
            //but when their is multiple input than we use syso in main function
         }
}
