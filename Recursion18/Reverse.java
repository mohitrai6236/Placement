package Recursion18;

public class Reverse {
    public static void printRev(String str,int idx){
        if(idx==0){// condition for the reverse
            System.out.println(str.charAt(idx));// learn it
            return;
        }

        System.out.println(str.charAt(idx));
        printRev(str,idx-1);// calling is done here
    }
    public static void main(String[] args) {
        String str ="abcd";
        printRev(str,str.length()-1);// for length
    }
}
