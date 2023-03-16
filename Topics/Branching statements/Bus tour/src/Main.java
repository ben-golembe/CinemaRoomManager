import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int bridgeHeight;
        boolean crashed = false;

        for (int i = 0; i < numberOfBridges; i++) {
            bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + (i + 1));
                crashed = true;
                break;
            }
        }
        if (!crashed) {
            System.out.println("Will not crash");
        }
    }
}