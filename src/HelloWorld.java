import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World! I'm from Myanmar!");
        System.out.println("Hello Myanmar!");
        String name = new Scanner(System.in).nextLine();
        if (name.equals("Sai Saing Hmine Tun")) {
            System.out.println("Welcome Sai!");
        } else {
            System.out.println("Who the heck are you?");
        }
    }
}
