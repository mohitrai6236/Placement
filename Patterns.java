import java.util.*;
public class Patterns {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        


        // @6 Wap 5
        //    1
        //    01
        //    101
        //    0101
        //    10101
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }


        // @5 Wap 5
              
        //       1
        //       2 3
        //       4 5 6
        //       7 8 9 10
        //       11 12 13 14 15
        // int number=1;

        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=i;k++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // @4 Wap 5
        //    12345
        //    1234
        //    123
        //    12
        //    1

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();

        // }
        // @3 Wap 5
        //      1
        //      12
        //      123
        //      1234
        //      12345
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


  //@2 Wap   *
    //      **
    //     ***
    //    ****
    //     for(int i=1;i<=n;i++){
           
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //          for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
 
 // @1 Wap *
        // **
        // ***
        // ****
         // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // *****
        // *   *
        // *   *
        // *****
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i==1 || j==1 || i==n || j==m){
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
                
        //     }
        //     System.out.println(); 
        // }
       
       
       
    //    wap *****
    //        *****
    //        *****
    //        ***** 
        // for(int i=1;i<=n;i++){

        //     for(int j=1;j<=m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
    
}
