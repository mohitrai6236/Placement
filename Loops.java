import java.util.*;
public class Loops {
    public static void main(String args[]){
    /*     for(int i=0;i<11;i++){
            System.out.println(i);
        }

        */
        // while loop
       /*  int i=0;
        while(i<11){
            System.out.println(i);

            i++;
        }
        
        //do while
        int i=0;
        do{
            System.out.println(i);
            i++;
        }
        while(i<11);
        
     
        //wap to print sum of the number
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        */

        //wap to print table of any number

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<11;i++){
            System.out.println(n*i);
        }
    }
}
