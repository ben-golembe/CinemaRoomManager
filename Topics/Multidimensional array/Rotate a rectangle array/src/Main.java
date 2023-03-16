import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        int[][] arr = new int[index1][index2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println(arr[0][i]);
        }
    }
}