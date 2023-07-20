import java.util.*;
public class Strings {
    public static void main(String args[]){

        // @3 Concatenation

        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.length()); // It use to print that how many character are their in a sentence
        // System.out.println(fullName); // It is use to print the name
        
        // @4 charAt

        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));// this is used to find out what character will come at what place
        }
       







// ________________________________________________________________________________________________________________________________________
// @1 Wap on how to write a full sentence using String in java
//          Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine(); // nextLine is used to print the whole line but for one word we use only next
//         System.out.println("Tour name is : "+ name);

// ________________________________________________________________________________________________________________________________________
// @1 Wap to declare a names
        // //String declartion
        // String name = "Tony";
        // String fullname = "Tony Stark";
        // String sentence = " My name is Tony Stark";

    }
}
