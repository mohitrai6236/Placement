import java.util.*;
public class ArraysH {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        String names[]= new String[size];

        //Input
        for(int i=0;i<size;i++){
            names[i]=sc.next();
        }

        //output
        for(int i=0;i<names.length;i++){
            System.out.println("name is : " +names[i]);
        }
    }
}
