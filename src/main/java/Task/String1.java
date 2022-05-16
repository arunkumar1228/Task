package Task;

import java.util.Scanner;

//all small
public class String1 {

    public void method(String sr) {
        System.out.println(sr.toLowerCase());
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        new String1().method(st);
    }
}
