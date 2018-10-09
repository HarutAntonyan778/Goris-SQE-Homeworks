import java.util.Scanner;

public class Adderword {
    public static String a="Hello";
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        adder(str);

    }
    public static void adder(String str){
        System.out.println(a +" "+str);
    }
}
