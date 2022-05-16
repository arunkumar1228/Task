package Task;

import java.util.Scanner;

public class String4 {
    public void St(String hy){
      String  str=hy.replace(" ","-").toLowerCase();
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        new String4().St(st);
    }
}
