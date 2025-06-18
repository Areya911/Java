package github;

import java.util.Scanner;

public class signedoutput {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int a=in.nextInt();
       if(a<0){
       System.out.print(a);
    }
    else{
      System.out.print("+"+a);
    }
}

    
}
