package lecture14;
import java.util.*;

public class updateBit {
    public static void main(String[] args) {
        
    
    //Update the 2nd bit (position = 1) of a number n to 1. (n=0101)
     Scanner sc = new Scanner(System.in);

     int oper = sc.nextInt();

     int n=5;
     int pos=1;

     int bitMask = 1<<pos;
     if(oper == 1){

        
        int newNumber = bitMask | n;
        System.out.println(newNumber);
     } else{
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
     }
    }
}
