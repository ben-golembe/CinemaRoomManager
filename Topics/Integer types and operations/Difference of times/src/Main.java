import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int timePassed = 0;

        timePassed += (hours2 - hours1) * 3600;
        timePassed += (minutes2 - minutes1) * 60;
        timePassed += (seconds2 - seconds1);

        System.out.println(timePassed);
    }
}