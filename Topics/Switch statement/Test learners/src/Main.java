import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = scanner.nextInt();

        if (answer == 1) {
            System.out.println("Yes!");
        } else if (2 <= answer && answer <= 4) {
            System.out.println("No!");
        } else {
            System.out.println("Unknown number");
        }
    }
}
