public class Homework4 {
public static void main(String args[]) {
for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10 - i; j++) {
          System.out.print(" ");
}
for (int l = 0; l < i; l++){
System.out.print("* ");
}
System.out.println();
}
}
}