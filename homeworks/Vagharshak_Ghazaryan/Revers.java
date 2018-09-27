public class Revers {
 public static void main(String[] args) {
int num = 1234;
while (num > 0) {
int c = num % 10;
num = (num * 10) + c;
num /= 10;
}
Syestem.out.println(num);
}
}
