import java.util.*;

public class Solutions {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    
   int input;
   do{

    int n=sc.nextInt();
    if(n>=90){
        System.out.println("this is good");
    }else if(n>=60 && n<=89){
        System.out.println("tjis is also good");
    }
    else{
        System.out.println("marks doesnt matter");
    }

    System.out.println("press 0 or 1");
    input=sc.nextInt();
    
}while(input==1);
    }
}
