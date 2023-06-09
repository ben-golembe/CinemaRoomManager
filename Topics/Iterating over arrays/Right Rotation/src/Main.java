import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        steps = steps % arr.length;
        int startIndex = arr.length - steps;

        int[] oldArr = new int[arr.length];
        for (int i = 0; i < oldArr.length; i++) {
            oldArr[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = oldArr[(startIndex + i) % arr.length];
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}