import java.util.Scanner;

public class BasicLoop {

    public void loop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println(doSomethingWithInput(input));
            System.out.print("> ");
        }
    }

    public String doSomethingWithInput(String input) {
        return "< " + input;
    }

    public static void main(String[] args) {
        new BasicLoop().loop();
    }

}
