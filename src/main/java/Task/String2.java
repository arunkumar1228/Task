package Task;

import java.util.Scanner;

//all small remove space
public class String2 {
    public void remove(String st){
        System.out.println(st.toLowerCase().replaceAll("\\s",""));
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        new String2().remove(st);
    }
}
