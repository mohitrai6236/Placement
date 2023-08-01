import java.util.*;
public class StringsBp {
    public static void main(String args[]){

        StringBuilder sb =  new StringBuilder();

        int size = sb.charAt();
        String array[] = new String[size];
        int totLength = 0;

        for(int i=0;i<size;i++){
            array[i] = sb.next();
            totLength += array[i].length();
        }

        System.out.println(sb);
    }
}
//  Scanner sc =  new Scanner(System.in);
//         int size = sc.nextInt();
//         String array[] = new String[size];
//         int totLength = 0;

//         for(int i=0;i<size;i++){
//             array[i] = sc.next();
//             totLength += array[i].length();
//         }

//         System.out.println(totLength);