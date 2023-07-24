public class StringsB {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
// _______________________________________________________________________________________________________________
//        @1 //find the charater at index 0
//         System.out.println(sb.charAt(0));// 0 define what letter is that position
// ________________________________________________________________________________________________________________
//        @2 //set char at index 0

//         sb.setCharAt(0, 'P');// it will replace the letters
//         System.out.println(sb);
   //____________________________________________________________________________________________________________________________

   // @3 insert at the given place         
           sb.insert(2,'n');
            
            //sb.insert(0, 'S');
            System.out.println(sb);// it is used to insert the char
// _______________________________________________________________________________________________________________
            // @4 delete the extrea n

            sb.delete(2, 3);
            System.out.println(sb);

    }
}
