import java.util.*;
public class ArraysH {
   


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input

        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        boolean isAscending=true;

        for(int i=0;i<numbers.length-1;i++){     // numbers.length-1 as terminating codition

            if(numbers[i]>numbers[i+1]) {      // this is the condition for the decending order

                isAscending = false;
            }
            
        }
         if(isAscending) {
        System.out.println("ascending order");
    }else {
        System.out.println("not ascending");
    }
    }

   



//    ______________________________________________________________________________________
//    @2 Wap to Find the maximum & minimum number in an array of integers.
    
//    public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         //input

//         for(int i=0;i<size;i++){
//             numbers[i] = sc.nextInt();
//         }

//         int max = Integer.MIN_VALUE;
//         int min=Integer.MAX_VALUE;

//         for(int i=0;i<numbers.length;i++){
//             if(numbers[i]>max){
//                 max=numbers[i];
//             }
//             if(numbers[i]<min){
//                 min=numbers[i];
//             }

//         }
//         System.out.println("largest number is : " + max);
//         System.out.println("Smallest number is : " + min);
//     }
  
//     _______________________________________________________________________________________
//    @1 Wap to print names
    // public static void main(String args[]){
    //     Scanner sc =new Scanner(System.in);
    //     int size = sc.nextInt();
    //     String names[]= new String[size];

    //     //Input
    //     for(int i=0;i<size;i++){
    //         names[i]=sc.next();
    //     }

    //     //output
    //     for(int i=0;i<names.length;i++){
    //         System.out.println("name is : " +names[i]);
    //     }
    // }
}
