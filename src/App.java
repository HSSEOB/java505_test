import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Addr adder = new Addr();
        sub sub = new sub();


        adder.run(adder.a, adder.b);
        sub.run(sub.a, sub.b);
    }
}
