import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] numberArray = new int[len];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > n) {
                sum += numberArray[i];
            }
        }

        System.out.println(sum);
    }
}