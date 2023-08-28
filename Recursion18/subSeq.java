package Recursion18;

public class subSeq {
    // WAP to print all the subsequences of a string
    public static void subsequences(String str, int idx, String newString){
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
