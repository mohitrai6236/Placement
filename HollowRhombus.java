import java.util.*;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
 

        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(i);
            }
            System.out.println();
        }

//         @5 Wap
//         5

//     1
//    1 2
//   1 2 3
//  1 2 3 4


//         for(int i=0;i<n;i++){
//              for(int j=1;j<=n-i;j++){
//                  System.out.print(" ");
//           }
//           for(int j=1;j<=i;j++){
//             System.out.print(j + " ");
//           }
//           System.out.println();
//         }

//         @4 Wap
//         4
//     1
//    1 1
//   1 2 1
//  1 3 3 1


//         int number = 1;

//         for(int i=0;i<n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             number = 1;
//             for(int j=0;j<=i;j++){
//                 System.out.print(number + " ");
//                 number =number * (i-j)/(j+1);
//             }
            
//             System.out.println();
//         }


//         @Wap 
//         5
// *        *
// **      **
// * *    * *
// *  *  *  *
// *   **   *
// *   **   *
// *  *  *  *
// * *    * *
// **      **
// *        *


//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if(i==1  || j==1 || j==i){
//             System.out.print("*");
//                  }else {
//                      System.out.print(" ");
//                  }
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                if(i==1  || j==1 || j==i){
//             System.out.print("*");
//                  }else {
//                      System.out.print(" ");
//                  }
//             }
//             System.out.println();
//         }

//         for(int i=n;i>=1;i--){
//             for(int j=i;j>=1;j--){
//                 if(i==1  || j==1 || j==i){
//             System.out.print("*");
//                  }else {
//                      System.out.print(" ");
//                  };
//             }
//             for(int j=2*(n-i);j>=1;j--){
//                 System.out.print(" ");
//             }
//             for(int j=i;j>=1;j--){
//              if(i==1  || j==1 || j==i){
//             System.out.print("*");
//                  }else {
//                      System.out.print(" ");
//                  }
//             }
//             System.out.println();
//         }




//         @Wap

//         5
//     *****
//    *   *
//   *   *
//  *   *
// *****

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
// ____________________________________________________________________
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= n; j++) {
        //         if (j == 1 || j == n || i == 1 || i == n) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }

        //     }
        //     System.out.println();
        // }
    }
}