import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();

        System.out.println(givenNumber + 2 - (givenNumber % 2));
    }
}