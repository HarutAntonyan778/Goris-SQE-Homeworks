import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Array array =new Array();
        while (true){

            Scanner input =new Scanner(System.in);
            String command=input.nextLine();
            if (command.equals("delete"))array.delete();
            else if (command.equals("insert"))array.insert();
            else if (command.equals("update"))array.update();
            else if (command.equals("print"))array.print();
            else if (command.equals("read"))array.read();
            else if (command.equals("find"))array.find();

        }
    }
}
