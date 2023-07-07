import java.util.*;

import javax.jws.WebParam;
public class Pattern {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();



//         @4 Wap

//         5
//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=i;j>=2;j--){
                System.out.print("*");
            }
            System.out.println();
        }


//         @3 Wap
//         5
//     1
//    212
//   32123
//  4321234
// 543212345


//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//              for(int j=2;j<=i;j++){
//                 System.out.print(j);
//             }
//              System.out.println();
//         }

//         @2 Wap
//         5
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

//         for(int i=1;i<=n;i++){
//             for (int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }

//         @1 Wap Solution1
//         5
//      *****
//     *****
//    *****
//   *****
//  *****

    //     for(int i=1; i<=n; i++) {
    //        //spaces
    //        for(int j=1; j<=n-i; j++) {
    //            System.out.print(" ");
    //        }


    //        //stars
    //        for(int j=1; j<=n; j++) {
    //            System.out.print("*");
    //        }
    //        System.out.println();
    //    }

// @Solution2
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" ");
//             }
//            for(int j=1; j<=n; j++) {
//            System.out.print("*");
//             }
//             System.out.println();
//         }

           
      }
 
    
}
