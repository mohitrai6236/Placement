import java.util.*;
public class StringsP {
     public static void main(String args[]){
    //   ____________________________________________________________________________________________________________________________  
        // @1 Wap to check that the number of array block have how many string character

        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;

        for(int i=0;i<size;i++){
            array[i] = sc.next();
            totLength += array[i].length();
        }

        System.out.println(totLength);
    }
}
