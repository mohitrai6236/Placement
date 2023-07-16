import java.util.*;
public class Arrays {
    public static void main(String args[]){

        // @2 Wap to search a number in a array (Linear search)

        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        int x= sc.nextInt();

        //output
        for(int i=0;i<numbers.length;i++){       //numbers.length=size both are equal same

            if(numbers[i]==x){
                System.out.println("x found at index: " + i);

            }
        }






        // @1 Wap to print marks using array
        // Scanner sc = new Scanner (System.in);
        // int size = sc.nextInt();
        // int number[] = new int [size];
        // //input
        // for(int i=0;i<size;i++){
        //     number[i]=sc.nextInt();
        // }

        // //output
        // for(int i=0;i<size;i++){
        //     System.out.println(number[i]);
        // }
// ________________________________________________________________________

        // int[] marks=new int[3];
        // int marks[]= new int[3];
        // marks[0]=97;
        // marks[1]=98;
        // marks[2]=95;
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);

        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        // }
    }
}
