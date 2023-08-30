package Recursion18;
// very important
public class subSeq {
    // WAP to print all the subsequences of a string
    public static void subsequences(String str, int idx, String newString){ // subsequence is the name of function
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        //to be get added
        subsequences(str, idx+1, newString+currChar);

        //or not to be added
        subsequences(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
 // output
// abc
// ab
// ac
// a
// bc
// b
// c

