import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World! I'm from Myanmar!");
        int age = new Scanner(System.in).nextInt();
        if (age <= 10) {
            System.out.println("You're just " + age + "???");
        } else {
            System.out.println("Shit! You're too old! Just go to monastry!");
        }
    }
}
