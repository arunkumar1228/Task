package Task;

import java.util.Locale;
import java.util.Scanner;

//all small Replaces-space with underscore
public class String3 {
    public void Under(String st){
        String s= st.replace(" ","_").toLowerCase();
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        new String3().Under(st);
    }
}
