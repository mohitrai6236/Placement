public class StringsB {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //find the charater at index 0
        System.out.println(sb.charAt(0));// 0 define what letter is that position

        //set char at index 0

        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }
}
