public class StringsB {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("hello");

        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back =sb.length() -1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

System.out.println(sb);


        // for 1,2,3,4 only System.out.println(sb);
// sb.append("e");
// sb.append("l");
// sb.append("l");
// sb.append("0");
// //System.out.println(sb); >> this is to print the char
// System.out.println(sb.length());
        // @5 append the char means add char at the end of the word


// _______________________________________________________________________________________________________________
//        @1 //find the charater at index 0
//         System.out.println(sb.charAt(0));// 0 define what letter is that position
// ________________________________________________________________________________________________________________
//        @2 //set char at index 0

//         sb.setCharAt(0, 'P');// it will replace the letters
//         System.out.println(sb);
   //____________________________________________________________________________________________________________________________

//    // @3 insert at the given place         
//            sb.insert(2,'n');
            
//             //sb.insert(0, 'S');
//             System.out.println(sb);// it is used to insert the char
// // _______________________________________________________________________________________________________________
//             // @4 delete the extrea n

//             sb.delete(2, 3);
//             System.out.println(sb);

    }
}
